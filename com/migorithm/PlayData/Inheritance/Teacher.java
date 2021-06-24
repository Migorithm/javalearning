package com.migorithm.PlayData.Inheritance;

public class Teacher extends People {
    private int seniority;
    public Teacher(String name, int year){
        super(name);
        this.seniority = year;

    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}

