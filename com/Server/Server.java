package com.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread {
    private final int Serverport;//서버는 요청을 받고, 원하는 것을 클라이언트에게 주는 것
    private ArrayList<CT> ctArrayList = new ArrayList<CT>();

    public ArrayList<CT> getCtArrayList() {
        return ctArrayList;
    }

    public Server (int port){
        this.Serverport = port;
    }

    @Override
    public void run() {
        ServerSocket Server = null;
        try{
            Server = new ServerSocket(3317);
            while (true){
                System.out.println("유저 접속을 기다리고 있습니다...");
                Socket clientSocket = Server.accept();
                CT client = new CT(this,clientSocket);
                ctArrayList.add(client);
                System.out.println("유저"+ clientSocket +"가 접속했습니다.");
                Thread clientThread = new Thread(client);
                clientThread.start();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void removeWorker(CT ct) {
        ctArrayList.remove(ct);
    }
}




