package com.migorithm.Algorithm;

public class Algo_24_Harshad_number {
    public static void main(String[] args) {
        Algo_24_Harshad_number A = new Algo_24_Harshad_number();
        System.out.println(A.solution(11));
    }

    public boolean solution(int x) {
        char[] strs = String.valueOf(x).toCharArray();
        int sum = 0;
        for (int i =0 ; i <strs.length; i++){
            sum += Integer.parseInt(String.valueOf(strs[i]));
        }
        if (x % sum ==0){
            return true;
        }

        return false;
    }
}
