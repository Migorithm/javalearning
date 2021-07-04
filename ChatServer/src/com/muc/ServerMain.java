package ChatServer.src.com.muc;

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
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port); //Create a server socket. parameter for serverSocket is a port.
            while(true) {     //as you are to continuosly accpept client- > while(true)
                System.out.println("About to accept client connection...");
                Socket clientSocket = serverSocket.accept();
                // this is one that actually creates connection between server and the client. no connection -> blocked

                System.out.println("Accepted connection from "+clientSocket);
                //-> this will return client port and server port

                ServerWorker worker = new ServerWorker(clientSocket);
                worker.start();
            }
            } catch (IOException e) {
            e.printStackTrace();
    }}
}
