package com.chatServerPra;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server extends Thread{
    private int port ;
    private ArrayList<Workers> workersList = new ArrayList<Workers>();


    public Server (int port){
        this.port = port;
    }


    @Override
    public void run() {
        ServerSocket serverSocket =null;

        try {
            serverSocket = new ServerSocket(port);
            while(true) {
                System.out.println("About to accept client...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client login has been detected... - - >" + clientSocket);

                Workers worker = new Workers(this,clientSocket); //해당 소켓을 들고 있어야.
                workersList.add(worker);
                worker.start(); //없애는 것도 생각해야. (remove 할 때)

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void removeWorker(Workers workers) {
        workersList.remove(workers);
    }

    public List<Workers> getWorkerList() {
        return workersList;
    }
}
