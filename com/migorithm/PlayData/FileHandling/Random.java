package com.migorithm.PlayData.FileHandling;

import java.io.Serializable;
import java.util.ArrayList;

public class Random implements Serializable {
    private int age ;
    private String name;

    public Random(String name, int age){
        this.name =name;
        this.age = age;
    }
    public ArrayList info(){
        ArrayList info = new ArrayList();
        info.add(name);
        info.add(age);
        return info;
    }
}
