package com.chatServerPra;

public class ServerMain {
    public static void main(String[] args) {
        //create port number
        int port = 3315;

        Server server = new Server(port); //to get an access to every users, create server object that is collection of server workers
        server.start();

    }
}
