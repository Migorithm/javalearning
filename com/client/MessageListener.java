package com.client;

/*
whenever somebody sends you a message,
what happens is the other user will send a message to the server.
and the server will relate the msg to the targeted user.
 */


public interface MessageListener {
    public void onMessage(String fromLogin, String msgBody);


}
