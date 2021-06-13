package com.migorithm.practice.learning;

public class Bar {
    public static void main(String[] args) {
        int a = 10;
        int b = a ; // b is copy of a
        a = 100 ;
        System.out.println("a =" + a +" - b ="+ b);
        Person alex = new Person("alex");
        Person mariam = alex;
        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);
        alex.name ="Alexander"; // this affects the mariam as well as it points to the same.
        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
        mariam.name = "Marihwana";
        System.out.println(alex.name + " " + mariam.name);
    }
    static class Person{
        String name;
        Person(String name){
            this.name = name;
        }
    }

}
