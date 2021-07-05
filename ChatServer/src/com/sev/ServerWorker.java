package com.sev;

import java.io.*;
import java.net.Socket;

public class ServerWorker extends Thread{

    private final Socket clientSocket;


    public ServerWorker(Socket clientSocket) {
        this.clientSocket = clientSocket;

    }

    @Override
    public void run(){
        try {
            handleClientSocket();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void handleClientSocket() throws IOException, InterruptedException {
        InputStream inputStream = clientSocket.getInputStream();//to get access to input stream to read data
        OutputStream outputStream = clientSocket.getOutputStream(); //to get data from client.

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line; //container to get user input.
        while((line=reader.readLine())!= null){
            if ("quit".equalsIgnoreCase(line)) {//to check whether the line is the same as "quit" regardless of capital or minor.
                break;
            }
            String msg = "You typed :" + line + "\n";
            outputStream.write(msg.getBytes());
        }

        clientSocket.close();

        }
}
