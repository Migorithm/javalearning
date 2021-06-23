package com.migorithm.PlayData;

public class MakingE {
    public static void main(String[] args) {
        Prn(5);
    }
    public static void Prn(int number){
        int [][] arr = new int[number][];
        for (int i =0; i <arr.length; i++){
            if (i ==2){
                arr[i] = new int[5];
            }
            else if (i%2 ==1){
                arr[i] = new int[1];
            }
            else{arr[i]= new int[5];}
        }
        for (int[] res : arr){
            for (int result : res){
                System.out.printf("%c",'|');
            }
            System.out.println();
        }

    }
}
