package com.migorithm.PlayData;

public class MakeWindow {
    public static void main(String[] args) {
        prn(9,9);
    }
    public static void prn(int a, int b) {
        int[][] window = new int[a][];
        //홀수개의 컬럼을 갖고있다.
        for (int i =0; i < window.length ; i++) {
            window[i] = new int[b];
        }

        for (int i =0; i <window.length;i++) {
            for(int j = 0 ; j<window[i].length; j++) {
                if(i%(a/2)==0) {
                    System.out.printf("|");
                }
                else if(j%(b/2) ==0){
                    System.out.printf("|");
                }
                else
                {System.out.printf(" ");}
            }
            System.out.println();
        }


    }


}