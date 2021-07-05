package com.migorithm.PlayData.SimpleChat;

import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) {
        Socket client = null;

        try {
            client = new Socket("127.0.0.1",9090);
            InputStream is = client.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            String str = dis.readUTF();
            System.out.println("서버에서 보낸 것 : "+ str);


            //서버로 메세지 보내기.
            OutputStream ot = client.getOutputStream();
            DataOutputStream dot = new DataOutputStream(ot);
            dot.writeUTF("나 접속했어.");


            dis.close();
            is.close();

        }catch(Exception e) {
            System.err.println(e);
        }finally {
            try {
                client.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }

    }
}