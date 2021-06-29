package com.migorithm.PlayData.Login;

import java.util.ArrayList;

public class LoginTest {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(); //for bill and shipping info
        arr.add(50000.0);
        arr.add("Arrived : 29th of July");
        Customer p1 = new Customer(1234,"square9",true,"Migo","Gangnam","saka90030@gmail.com",arr);

        System.out.println(p1.adminPrivilege());
        System.out.println(p1.bill());
        System.out.println(p1.getAddress());
        System.out.println(p1.getEmail());
        System.out.println(p1.verify_login());

    }
}
