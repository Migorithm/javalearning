package com.chatServerPra;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class Workers extends Thread {
    private final Socket clientSocket;
    private final Server server;
    private String id = null;
    private OutputStream outputStream;


    public Workers(Server server, Socket clientSocket){
        this.server = server;
        this.clientSocket = clientSocket;
    };

    @Override
    public void run() {
        try {
            handleClientSocket(); //how are you going to handle a client socket?
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleClientSocket() throws IOException {
        InputStream inputStream = clientSocket.getInputStream(); //to get an input from user
        this.outputStream = clientSocket.getOutputStream(); //to send a message to user
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line =reader.readLine())!=null){
            String[] tokens = line.split(" ");
            if (tokens !=null && tokens.length >0){
                String cmd = tokens[0];
                if ("login".equalsIgnoreCase(cmd)){
                    handleLogin(outputStream,tokens);
                }
                else if (cmd.equalsIgnoreCase("quit") || (cmd.equalsIgnoreCase("logoff"))){
                    handleLogoff();
                    break;
                }
                else if (cmd.equalsIgnoreCase("msg")){
                    String[] tokenMsg = line.split(" ",3);
                    handleMessage(tokenMsg);

                }
            }
        }
    }

    private void handleMessage(String[] tokenMsg) {
        String sendTo = tokenMsg[1];

    }


    private void handleLogoff() throws IOException {
        //you have to remove current worker.
        server.removeWorker(this);

        List<Workers> workersList = server.getWorkerList();
        //send other users current user's status
        String onlineMsg = "Offline" + id + "\n";
        for (Workers worker : workersList) {
            if (!id.equals(worker.getLoginId())) {
                worker.send(onlineMsg);
            }
        }
        clientSocket.close();

    }

    private void handleLogin(OutputStream outputStream, String[] tokens) throws IOException {
        //check if the token has valid id and password
        if(tokens.length==3){
            String login = tokens[1];
            String password = tokens[2];
            if((login.equals("Migo") && password.equals("admin1234")) || (login.equals("Encore") && password.equals("haha"))) {
                this.id = login;

                //greeting
                String msg = "Login succeeded. Hello " + id + "!\n";
                outputStream.write(msg.getBytes());


                //to check through workersList
                List<Workers> workersList = server.getWorkerList();

                for (Workers worker : workersList) {
                    if (worker.getLoginId() != null) { //로그인한 아이디가 있고
                        if (!id.equals(worker.getLoginId())) {//로그인한 아이디가 현재  접속한 아이디가 아닌 경우.
                            String msg2 = "Online " + worker.getLoginId() + "\n";
                            this.send(msg2); //해당 메세지를 보낸다.
                        }
                    }
                }
                //to send other users current user's status
                String onlineMsg = "Online " + id + "\n";
                for (Workers worker : workersList) {
                    if (!id.equals(worker.getLoginId())) {
                        worker.send(onlineMsg);
                    }
                }
            }else{
                String msg = "Error login\n";
                outputStream.write(msg.getBytes());






            }
        }
    }

    private void send(String msg) throws IOException {
        if(id !=null) {
            outputStream.write(msg.getBytes());
        }
    }


    public String getLoginId() {
        return id;
    }
}
