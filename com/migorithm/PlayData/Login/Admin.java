package com.migorithm.PlayData.Login;

public class Admin extends User{
    private String admin_name;
    private String email;

    public Admin(int id, String password, boolean login_status, String admin_name, String email){
        super(id,password,login_status);
        this.admin_name = admin_name;
        this.email=email;

    }
    @Override
    public boolean adminPrivilege() {
        return true;
    }

    public String getEmail() {
        return email;
    }
}
