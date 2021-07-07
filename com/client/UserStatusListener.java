package com.client;

public interface UserStatusListener {

    public void online(String login); //to notify when user comes online
    public void offline(String login); // for when user goes offline
}
