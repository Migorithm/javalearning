package com.sev;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread {
    private final int serverport;
    private ArrayList<ClientThread> workerList = new ArrayList<>(); //empty list

    public Server(int serverPort) {
        this.serverport = serverPort;

    }
    public List<ClientThread> getWorkerList(){  //getter for workerlist  =  lists of threads
        return workerList;
    }


    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(serverport); //Create a server socket. parameter for serverSocket is a port.
            while(true) {     //as you are to continuosly accpept client- > while(true)
                System.out.println("About to accept client connection...");
                Socket clientSocket = serverSocket.accept();
                // this is one that actually creates connection between server and the client. no connection -> blocked
                System.out.println("Accepted connection from "+clientSocket);
                //-> this will return client port and server port
                ClientThread worker = new ClientThread(this,clientSocket); // why server as a parameter? to let other thread know how many workers are out there.
                workerList.add(worker); // add workers(threads) to empty list

                worker.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
