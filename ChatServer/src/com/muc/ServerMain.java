package com.muc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
Created by Migo on 01/07/2021
 */
public class ServerMain {
    public static void main(String[] args) {
        //netstat -a -b << to check ports being used.
        int port = 3314;

        try {
            ServerSocket serverSocket = new ServerSocket(port); //parameter for serverSocket is a port.
            while(true) { //as you are to continuosly accpept client- > while(true)
                Socket clientSocket = serverSocket.accept(); // this is one that actually creates connection between server and the client. no connection -> blocked
                clientSocket.getOutputStream();
            }
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
