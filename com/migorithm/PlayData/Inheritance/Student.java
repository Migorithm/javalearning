package com.migorithm.PlayData.Inheritance;

public class Student extends People{

    private int year;
    public Student(String name, int year){
        super(name);
        this.year = year;


    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public void intro(){
        System.out.println("Hi, my name is " +getName()+ " I'm " + year+"years old");
    }
}
