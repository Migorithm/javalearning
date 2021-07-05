package com.migorithm.PlayData.SimpleChat;

import java.net.*;
import java.io.*;

//서버에서 글자써서 클라이언트에게 보내기
public class TCPServer {
    public static void main(String[] args) {

        ServerSocket server = null;
        Socket service = null;
        DataOutputStream oos = null;
        OutputStream ops = null;
        InputStream ips = null;

        try {
            server = new ServerSocket(9090);
            System.out.println("클라이언트의 접속을 기다린다. ");
            while(true) {
                service = server.accept();
                System.out.println("클라이언트 접속");
                //서버에서 글자써서 클라이언트에게 보내기
                ops = service.getOutputStream();
                oos = new DataOutputStream(ops); // outputstream객체에 글을 쓴 것.
                oos.writeUTF("Hello java.net");

                //클라이언트로부터 메세지 받기.
                ips = service.getInputStream();
                DataInputStream ip = new DataInputStream(ips);
                String reads = ip.readUTF();
                System.out.println(reads);

            }
        }
        catch(Exception e ) {
            System.out.println(e);
        }finally {

            try {
                oos.close();
                ops.close();
                service.close();
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

