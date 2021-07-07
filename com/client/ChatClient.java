package com.client;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ChatClient {
    private final String serverIP;
    private final int serverPort;
    private Socket socket;
    private OutputStream serverOut;
    private InputStream serverIn;
    private BufferedReader bufferedIn;

    //to register multiple user listeners
    private ArrayList<UserStatusListener> userStatusListeners = new ArrayList<>();


    public ChatClient(String serverIP, int serverPort) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public static void main(String[] args) throws IOException {
        ChatClient client = new ChatClient("localhost",8818);
        if(!client.connect()){//if not able to connect with the host and port,
            System.err.println("Connection failed.");
        }else {
            System.out.println("Connect successfully.");

            //after connection, we will want to login. and test it.
            if (client.login("migo", "admin1234")) {
                System.out.println("Login Successfully");
            }
         else{
            System.err.println("Login failed");
            }
        }
    }



    private boolean login(String login, String password) throws IOException {
        //create cmd to send to a server.
        String cmd = "login " +login + " " +password + "\n"; //this is format I've made.
        serverOut.write(cmd.getBytes()); // this will be passed to serverside, read as they socket.getOutputStream.


        //after connection, we're going to read a line from the server.
        String response = bufferedIn.readLine();
        System.out.println("Response Line:" + response);
        if(response.equalsIgnoreCase("Ok login")){
            return true;}
        else{return false;
    }
}

    //to make a connection to the server
    private boolean connect(){
        try {
            this.socket = new Socket(serverIP,serverPort);  //#parameter for the socket is host and port.

            this.serverOut = socket.getOutputStream(); //once you create socket, you can get in and output stream
            this.serverIn = socket.getInputStream();

            //to read serverIn input stream, we're gonna create buffer reader
            this.bufferedIn = new BufferedReader(new InputStreamReader(serverIn));


            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }return false;
    }



    //to allow other components to register listener to this ChatClient
    //with these method below, before login, I will register them online
    public void addUserStatusListener(UserStatusListener listener){
        userStatusListeners.add(listener);
    }
    public void removeUserStatusListener(UserStatusListener listener){
        userStatusListeners.remove(listener);
    }

}
