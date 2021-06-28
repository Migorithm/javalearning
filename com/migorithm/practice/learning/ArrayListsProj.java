package com.migorithm.practice.learning;

import java.util.ArrayList;

public class ArrayListsProj {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits); //it returns a gibberish
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Apple");
        System.out.println(fruitList); // you can see it right away.

        fruitList.remove("Apple");
        //fruitList.clear()
        System.out.println(fruitList.contains("Apple"));
        fruitList.forEach(x -> {
            System.out.println(multi(x));}); //as it is specified you can do it!

        // ----------------------------------------------------------//
        ArrayList fruitsList = new ArrayList<>();
        fruitsList.add("Mango");
        fruitsList.add("Apple");
        fruitsList.add("Strawberry");
        fruitsList.add("Apple");
        System.out.println(fruitsList);

        fruitsList.forEach(x -> {
            System.out.println(multi((String) x)*5);}); // by converting one data type to the other, you can make it
    }
    public static int multi(String a){
        return a.length();
    }
}

