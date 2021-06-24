package com.migorithm.PlayData.Inheritance;

public class People {
    private String name;



    public People(String name) {
        this.name = name;

    }
    public void intro(){
        System.out.println("Hi, my name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
