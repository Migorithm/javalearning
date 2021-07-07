package com.chat;

/*
Created by Migo on 07/07/2021
 */
public class MainServer {
    public static void main(String[] args) {
        //nc localhost 3314
        int port = 3314;
        Server server = new Server(port); // user-defined
        server.start(); //main server
    }
}

//파일 저장, 내용 저장
//자바 채팅 서버 .exe 만들기