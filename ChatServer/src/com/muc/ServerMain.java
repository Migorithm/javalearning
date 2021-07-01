package com.muc;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/*
Created by Migo on 01/07/2021
 */
public class ServerMain {
    public static void main(String[] args) {
        //netstat -a -b << to check ports being used.
        int port = 3314;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port); //Create a server socket. parameter for serverSocket is a port.
            while(true) {     //as you are to continuosly accpept client- > while(true)
                System.out.println("About to accept client connection...");
                Socket clientSocket = serverSocket.accept(); // this is one that actually creates connection between server and the client. no connection -> blocked
                System.out.println("Accepted connection from "+clientSocket);
                //-> this will return client port and server port

                OutputStream outputStream = clientSocket.getOutputStream();// every socket has OutputStream
                for(int i=0 ; i<10; i++){
                    outputStream.write(("Time now is " + new Date() + "\n").getBytes());
                    Thread.sleep(1000);
                }
                //but this leaves an difficulty in handling server.
                outputStream.write("Hello World!\n".getBytes());
                clientSocket.close();


            }
            } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();}


    }
}
