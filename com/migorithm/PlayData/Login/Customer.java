package com.migorithm.PlayData.Login;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends User {
    private String customer_name;
    private String address;
    private String email;
    private ArrayList credit_card_info;
    public String getCustomer_name() {
        return customer_name;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public double bill() {
        return (double)credit_card_info.get(0);
    } //len = 2
    public String getShipping_info() {
        return (String)credit_card_info.get(1);
    }

    public Customer(int id, String password, boolean login_status, String customer_name,String address,
                    String email, ArrayList credit_card_info){
        super(id,password,login_status);
        this.customer_name =customer_name;
        this.address = address;
        this.email = email;
        this.credit_card_info = credit_card_info;
    }
    @Override
    public boolean adminPrivilege() {
        return false;
    }
}
