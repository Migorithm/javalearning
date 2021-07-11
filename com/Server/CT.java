package com.Server;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;


public class CT implements Runnable  {
    private final Server server;
    private final Socket client;
    private InputStream clientInput;
    private OutputStream OutputToClient;
    private HashSet<String> channelSet = new HashSet<>();

    public String getId() {
        return id;
    }

    private String id ;

    public CT(Server server, Socket client) {
        this.server = server;
        this.client = client;

    }

    @Override
    public void run() {
        try {
            ClientHandling();
            }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void ClientHandling() throws IOException {
        clientInput = client.getInputStream();
        OutputToClient = client.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(clientInput));
        //InputStreamReader isr = new InputStreamReader(clientInput);
        String line;

        while ((line =br.readLine())!=null ){
            //로그인 화면 + 유저 인터페이스 띄우기 .
            String[] token = line.split(" ");

            if (token != null && token.length > 0){
                String cmd = token[0];
                if ("login".equalsIgnoreCase(cmd)){
                    LoginHandling(token);}

                else if("logoff".equalsIgnoreCase(cmd)){
                    LogoffHandling();
                    break;
                }
                else if("msg".equalsIgnoreCase(cmd)){
                    String[] tokenMsg = line.split(" ",3);
                    MessageHandling(tokenMsg);
                }
                else if("join".equalsIgnoreCase(cmd)){
                    Channeling(token);
                }
            }
        }
}

    private void Channeling(String[] token) {
        if(token.length>1){
            String channel = token[1];
            channelSet.add(channel);
        }
    }

    private void MessageHandling(String[] token) throws IOException {
        if (token != null && token.length ==3){
            String sendTo = token[1];
            String body = token[2];
            boolean isChannelMsg = sendTo.charAt(0) =='#'; //채널메세지인지 확인.

            List<CT> clientList = server.getCtArrayList();
            for (CT ct : clientList) {
                if (isChannelMsg){
                    if (ct.channelSet.contains(sendTo)){ //해당 유저가 특정 채널에 조인했다면, 채널셋에 포함되어있을것.
                        String outMsg = getId() + " send a message :" + body + "\n";
                        ct.send(outMsg);
                    }
                }
                else {
                    if(sendTo.equalsIgnoreCase(ct.getId())){
                        String outMsg = getId() + " send you a message : " + body + "\n";
                        ct.send(outMsg);
                    }
                }
            }

        }
    }
    private void send(String outMsg) throws IOException {
        if (id != null){
            OutputToClient.write(outMsg.getBytes());
        }
    }


    private void LogoffHandling() throws IOException {
        OutputToClient.write("Bye for now!\n".getBytes());
        server.removeWorker(this);
        List<CT> clientThread = server.getCtArrayList();

        String logoffMsg = "Offline " + getId() + "\n";
        for (CT ct : clientThread) {
            if(!getId().equalsIgnoreCase(ct.getId())){
                ct.send(logoffMsg);
            }
        }
        client.close();
    }

    private void LoginHandling(String[] token) throws IOException {
        OutputToClient.write("login...\n".getBytes());
        if (token.length ==3){
            String id = token[1];
            String pwd = token[2];
            if ((id.equalsIgnoreCase("migo") && pwd.equalsIgnoreCase("admin1234")) || (id.equalsIgnoreCase("mago") && pwd.equalsIgnoreCase("admin1234"))){
                OutputToClient.write("Login Success\n".getBytes());
                this.id = id;
                List<CT> clientThread = server.getCtArrayList();
                for (CT ct : clientThread) {
                    if(ct.getId() != null){
                        if(!id.equals(ct.getId())){
                            String onMessage = "Online " + ct.getId() + "\n"; //tell this users about other's status
                            send(onMessage); //and send the message to current thread's "send" method
                        }
                    }
                }
                String onMessage = "Online " +getId() + "\n";
                for (CT ct : clientThread) {
                    if(!id.equals(ct.getId())){ //tell others current status of user
                        ct.send(onMessage); // and send it to other thread's send method.
                    }
                }

            }
            else{OutputToClient.write("Not a valid ID - Password pair\n".getBytes());}

        }

    }
}
