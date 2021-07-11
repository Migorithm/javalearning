package com.Server;

public class ServerEntry {
    public static void main(String[] args) {
        int port =3317;
        Server Server = new Server(port);
        Server.start();
    }


}
