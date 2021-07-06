package com.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
Created by Migo on 01/07/2021
 */
public class MainServer {
    public static void main(String[] args) {
        //nc localhost 3314
        int port = 3314;
        Server server = new Server(port); // user-defined
        server.start(); //main server
    }
}