package com.migorithm;

import java.time.LocalDate;
import java.util.Locale;

public class Reference_Data {
    public static void main(String[] args) {
        String name = new String("Migorithm"); //reference type always start with upper case
        int age = 20;
        char c = 'A'; // it takes only one character whereas String  work.
        System.out.println(name.toUpperCase()); // reference types are stored in heap area
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }
}
