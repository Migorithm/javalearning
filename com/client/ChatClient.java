package com.client;

import org.apache.commons.lang3.StringUtils;

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
    private ArrayList<MessageListener> messageListeners = new ArrayList<>();


    public ChatClient(String serverIP, int serverPort) {
        this.serverIP = serverIP;
        this.serverPort = serverPort;
    }

    public static void main(String[] args) throws IOException {
        ChatClient client = new ChatClient("localhost",8818);

        client.addUserStatusListener(new UserStatusListener() {// as UserStatusListener is interface, you have to redefine them in 'anony' style.
            @Override
            public void online(String login) {
                System.out.println("ONLINE " + login);
            }
            @Override
            public void offline(String login) {
                System.out.println("OFFLINE " + login);

            }
        });

        client.addMessageListener(new MessageListener() {
            @Override
            public void onMessage(String fromLogin, String msgBody) {
                System.out.println("You got a message from " + fromLogin + " ====> "+msgBody);
            }
        });



        if(!client.connect()){//if not able to connect with the host and port,
            System.err.println("Connection failed.");
        }else {
            System.out.println("Connect successfully.");

            //after connection, we will want to login. and test it.
            if (client.login("migo", "admin1234")) {
                System.out.println("Login Successfully");

                client.msg("Encore","Hello world!");
            }
         else{
            System.err.println("Login failed");
            }

            //client.logoff();
         
        }
    }

    private void msg(String sentTo, String msgBody) throws IOException {
        String cmd = "msg " + sentTo + " "+ msgBody + "\n";
        serverOut.write(cmd.getBytes()); //this will be sent to server , processed in the way that it is to be processed in the server.
    }


    private boolean login(String login, String password) throws IOException {
        //create cmd to send to a server.
        String cmd = "login " +login + " " +password + "\n"; //this is format I've made.
        serverOut.write(cmd.getBytes()); // this will be passed to serverside, read as they socket.getOutputStream.


        //after connection, we're going to read a line from the server.
        String response = bufferedIn.readLine();
        System.out.println("Response Line:" + response);
        if(response.equalsIgnoreCase("Ok login")){
            //after login, wanna start reading responses from the server.
            startMessageReader();

            return true;}
        else{return false;
    }
}
    private void logoff() throws IOException {
        //all it does is just send logoff comment to the server.
        String cmd = "logoff\n";
        serverOut.write(cmd.getBytes());

    }


    private void startMessageReader() {
        //to schedule msgs in different thread.
        Thread t= new Thread() {
            @Override
            public void run(){

                readMessageLoop();
            }
    };
    t.start();
    }

    private void readMessageLoop() {
        //this will read line by line from the serveroutput.
        // and the serveroutput is going to be the user input.
        try{
        String line;

        while ((line= bufferedIn.readLine()) != null){
            String[] tokens = line.split(" ");
            if (tokens != null && tokens.length >0){
                String cmd = tokens[0];

                if ("online".equalsIgnoreCase(cmd)){
                    handleOnline(tokens);
                }else if ("offline".equalsIgnoreCase(cmd)){
                    handleOffline(tokens);
                }else if ("msg".equalsIgnoreCase(cmd)){
                    String[] tokensMsg = line.split(" ",3);
                    handleMessage(tokensMsg); //!
                }
            }
        }



    }catch (Exception e ){
            e.printStackTrace();
            //if exception occurs, i will close the socket.
            try {
                socket.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    private void handleMessage(String[] tokenMsg) {
        String login = tokenMsg[1];
        String msgBody = tokenMsg[2];
        for (MessageListener listener : messageListeners){
            listener.onMessage(login,msgBody);
        }

    }

    private void handleOffline(String[] tokens) {
        String login = tokens[1];
        for (UserStatusListener listener : userStatusListeners){
            listener.offline(login);
    }}

    private void handleOnline(String[] tokens) {
        //gonna callback user status listners.
        String login = tokens[1];
        for (UserStatusListener listener : userStatusListeners){
            listener.online(login);
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
    //with these methods below, before login, I will register them online
    public void addUserStatusListener(UserStatusListener listener){
        userStatusListeners.add(listener);
    }
    public void removeUserStatusListener(UserStatusListener listener){
        userStatusListeners.remove(listener);
    }

    public void addMessageListener(MessageListener listener){
        messageListeners.add(listener);
    }
    public void removeMessageListener(MessageListener listener){
        messageListeners.remove(listener);
    }

}


/*backlog
1. enable users to receive a message and create a listener for that message.



 */