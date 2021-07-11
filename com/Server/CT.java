package com.Server;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


public class CT implements Runnable  {
    Socket client = null;
    InputStream clientInput;
    OutputStream OutputToClient;

    public CT(Socket client) {
        this.client = client;

    }

    @Override
    public void run() {
        try {
            ClientHandling();
            }catch(IOException e){
            e.printStackTrace();
        }
    }

    private void ClientHandling() throws IOException {
        clientInput = client.getInputStream();
        OutputToClient = client.getOutputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(clientInput));
        //InputStreamReader isr = new InputStreamReader(clientInput);
        String line;

        while ((line =br.readLine())!=null ){
            //로그인 화면 + 유저 인터페이스 띄우기 .
            String[] token = line.split(" ");

            if (token != null && token.length > 0){
                String cmd = token[0];
                if ("login".equalsIgnoreCase(cmd)){
                    LoginHandling(token);}

                else if("logoff".equalsIgnoreCase(cmd)){
                    LogoffHandling();
                    break;
                }
            }
        }
}

    private void LogoffHandling() throws IOException {
        OutputToClient.write("Bye for now!\n".getBytes());
        client.close();
    }

    private void LoginHandling(String[] token) throws IOException {
        OutputToClient.write("login...\n".getBytes());
        if (token.length ==3){
            String id = token[1];
            String pwd = token[2];
            if (id.equalsIgnoreCase("migo") && pwd.equalsIgnoreCase("admin1234")){
                OutputToClient.write("Login Success\n".getBytes());
            }

        }
        else{OutputToClient.write("Not a valid ID - Password pair\n".getBytes());}
    }
}
