package com.migorithm.PlayData;

import java.util.concurrent.TimeUnit;

public class Chaining_Constructor {
    public static void main(String[] args) {

        long start = System.nanoTime();

        Test first = new Test();

        long elapsedTime = System.nanoTime()-start;

        double second = (double)elapsedTime/100000000000000.0;

        System.out.println(second);

    } //0.0006889
        //double -> int 이걸 이걸!  #1내가 뭘 아는지, 뭘 모르는지를 판단한다. -> 2. 어떻게 하면 알수 있는지 알아낸다.  -> 3. 그리고 공부한다.
    // "abcde"  -> a   b   c   d   e

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