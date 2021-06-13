package com.migorithm.practice.learning;

import java.util.*;
public class While_loop {
    public static void main(String[] args) {
        int count = 0;
        while (count<=20) { // it executes suite given boolean expressions in round bracket being true
            System.out.println("count "+count);
            count ++;

        }

        int cnt =5;
        do {
            System.out.println(cnt);
            cnt++;
        }while(cnt <=20);

    }
}
