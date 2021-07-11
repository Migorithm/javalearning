package com.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {//서버는 요청을 받고, 원하는 것을 클라이언트에게 주는 것

    public static void main(String[] args) {
        ServerSocket Server = null;
        int port = 3317;
        try{
            Server = new ServerSocket(3317);
            while (true){
                System.out.println("유저 접속을 기다리고 있습니다...");
                Socket clientSocket = Server.accept();
                CT client = new CT(clientSocket);
                System.out.println("유저"+ clientSocket +"가 접속했습니다.");
                Thread clientThread = new Thread(client);
                clientThread.start();

            } //여기서 이제 뭐하고 싶니?

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
