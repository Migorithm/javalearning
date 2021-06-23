package com.migorithm.PlayData;

import java.util.concurrent.TimeUnit;

public class Chaining_Constructor {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Test02 first = new Test02();
        long elapsedTime = System.nanoTime()-start;
        double second = (double)elapsedTime/1000000000.0;
        System.out.println(second);
    }

    public static class Test {
        private int a, b;

        public Test() {
            this.a = 10;
            this.b = 20;

        }

    }
    public static class Test02{
        private int a ,b;

        public Test02(){
            this(10,20);

        }

        public Test02(int a ,int b ){
            this.a =a ;
            this.b =b ;
        }
}}