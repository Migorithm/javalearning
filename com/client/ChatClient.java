package com.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient {
    private final String serverIP;
    private final int serverPort;
    private Socket socket;
    private OutputStream serverOut;
    private InputStream serverIn;

    public ChatClient(String serverIP, int serverPort) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public static void main(String[] args) throws IOException {
        ChatClient client = new ChatClient("localhost",3314);
        if(!client.connect()){//if not able to connect with the host and port,
            System.err.println("Connection failed.");
        }else{
            System.out.println("Connect successfully.");

            //after connection, we will want to login.
            client.login("nayoung","admin1234");
        }
    }

    private void login(String login, String password) throws IOException {
        //create cmd to send to a server.
        String cmd = "login " +login + " " +password + "\n"; //this is format I've made.
        serverOut.write(cmd.getBytes()); // this will be passed to serverside, read as they socket.getOutputStream.

    }

    //to make a connection to the server
    private boolean connect(){
        try {
            this.socket = new Socket(serverIP,serverPort);  //#parameter for the socket is host and port.

            this.serverOut = socket.getOutputStream(); //once you create socket, you can get in and output stream
            this.serverIn = socket.getInputStream();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }return false;
    }

}
