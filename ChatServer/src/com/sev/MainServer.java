package com.sev;


/*
Created by Migo on 01/07/2021
 */
public class MainServer {
    public static void main(String[] args) {
        //netstat -a -b << to check ports being used.
        int port = 3314;
        Server server = new Server(port); // 1. open
        server.start(); //main server  // 2. and start
    }
}
