package ChatServer.src.com.muc;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

public class ClientThread extends Thread {

    private final Socket clientSocket;
    private final Server server;
    private String login = null;
    private OutputStream outputStream;
    private HashSet<String> topicSet  = new HashSet<>(); //to store membership of users to a topic


    public ClientThread(Server server, Socket clientSocket) {
        this.server = server;
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            handleClientSocket();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void handleClientSocket() throws IOException, InterruptedException {
        InputStream inputStream = clientSocket.getInputStream();//to get access to input stream to read data
        this.outputStream = clientSocket.getOutputStream(); //to get data from client.

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line; //container to get user input.
        while ((line = reader.readLine()) != null) {
            String[] tokens = StringUtils.split(line);

            if (tokens != null && tokens.length > 0) { //to make sure those token doesn't cause any no pointer exception.
                String cmd = tokens[0]; // first token is going to be our command.
                if ("logoff".equals(cmd) || "quit".equalsIgnoreCase(cmd)) {
                    //to check whether the line is the same as "quit" regardless of capital or minor.
                    handleLogoff();
                    break;
                } else if ("login".equalsIgnoreCase(cmd)) {

                    handleLogin(outputStream, tokens);
                } else if ("msg".equalsIgnoreCase(cmd)){
                    String[] tokenMsg = StringUtils.split(line,null,3);
                    handleMessage(tokenMsg);
                } else if ("join".equalsIgnoreCase(cmd)){
                    handleJoin(tokens);
                }

                else {
                    String msg = "unknown " + cmd + "\n";
                    //if we don't recognize that command, give error back to client.
                    outputStream.write(msg.getBytes());
                }
            }
        }
        clientSocket.close();
    }

    public boolean isMemberOfTopic (String topic){
        return topicSet.contains(topic);
    }

    private void handleJoin(String[] tokens) {
        if (tokens.length>1){
            String topic = tokens[1]; //topic is a second token
            topicSet.add(topic); //this connection is a part of this topic -> require testing

        }
    }

    //format : "msg" "login" body...
    //format : "msg" "#topic body...
    private void handleMessage(String[] tokens) throws IOException {
        String sendTo = tokens[1];
        String body = tokens[2];

        boolean isTopic = sendTo.charAt(0)=='#';

        List<ClientThread> workerList = server.getWorkerList();
        for(ClientThread worker : workerList){
            //if the worker login matches the sendTo , then we'll send the message to that particular worker.
            if (isTopic){
                if (worker.isMemberOfTopic(sendTo)){
                    String outMsg = login + " send a message to "+  sendTo + ": " + body + "\n";
                    worker.send(outMsg);
                }
            }

            else {
                if(sendTo.equalsIgnoreCase(worker.getLogin())){
                String outMsg =  login + " send a message : " + body + "\n";
                worker.send(outMsg);
            }}

        }

    }

    private void handleLogoff() throws IOException {
        //when user logs off, we need to remove current instance.
        server.removeWorker(this);

        List<ClientThread> workerList = server.getWorkerList();

        //send other lone users current user's status
        String onlineMsg = "Offline "  + login + "\n";
        for (ClientThread worker : workerList) {
            if (!login.equals(worker.getLogin())) {
                worker.send(onlineMsg);
            }
        }
        clientSocket.close();
    }

    public String getLogin(){
        return login;
    }

    private void handleLogin(OutputStream outputStream, String[] tokens) throws IOException {

        if (tokens.length == 3) {
            String login = tokens[1];
            String password = tokens[2];
            if ((login.equals("guest") && password.equals("guest")) || (login.equals("jim") && password.equals("jim"))) {
                String msg = "Ok login\n";
                outputStream.write(msg.getBytes());
                this.login = login;
                System.out.println("User logged in successfully: " + login);

                List<ClientThread> workerList = server.getWorkerList();

                //send current user al other onlin logins
                for (ClientThread worker : workerList){

                    if(worker.getLogin() != null) {
                        if (!login.equals(worker.getLogin())) {
                            String msg2 = "Online " + worker.getLogin() + "\n";
                            this.send(msg2);
                    }

                    }
                }

                //send other lone users current user's status
                String onlineMsg = "Online " + login + "\n";
                for (ClientThread worker : workerList) {
                    if (!login.equals(worker.getLogin())) {
                        worker.send(onlineMsg);
                    }
                }
            }else {
                String msg = "Error login\n";
                outputStream.write(msg.getBytes());
        }
        }
        }


    private void send(String msg) throws IOException {
        if (login != null) {
            outputStream.write(msg.getBytes());
        }

    }
}