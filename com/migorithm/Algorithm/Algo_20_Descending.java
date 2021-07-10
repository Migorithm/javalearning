package com.migorithm.Algorithm;


import java.util.Arrays;

public class Algo_20_Descending {
    public static void main(String[] args) {
        Algo_20_Descending A = new Algo_20_Descending();
        System.out.println(A.solution(213127569));

    }
    public long solution(long n) {
        long answer = 0;
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);

        char[] ans = new char[chars.length];
        for (int i = chars.length-1; i >=0; i--) {
            int idx = Math.abs(i-(chars.length-1));
            ans[idx] = chars[i];
        }
        String answ = String.valueOf(ans);
        answer = Long.parseLong(answ);

        return answer;
    }


}
