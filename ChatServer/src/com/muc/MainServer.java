package ChatServer.src.com.muc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/*
Created by Migo on 01/07/2021
 */
public class MainServer {
    public static void main(String[] args) {
        //netstat -a -b << to check ports being used.
        int port = 3314;
        Server server = new Server(port);
        server.start(); //main server
    }
}
