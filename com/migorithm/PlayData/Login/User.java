package com.migorithm.PlayData.Login;

public abstract class User {
    private int user_id;
    private String password;
    private Boolean login_status;

    public User(int id, String password, boolean login_status){
        this.user_id = id;
        this.password = password;
        this.login_status = login_status;
    }

    public boolean verify_login(){
        return login_status;
    }
    public int getUser_id(){
        return user_id;
    }
    public abstract boolean adminPrivilege();
}
