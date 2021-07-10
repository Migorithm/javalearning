package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12910

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Algo_25_dividable {
    public static void main(String[] args) {
        Algo_25_dividable A = new Algo_25_dividable();
        int [] answer = A.solution(new int[]{5, 9, 7, 10}, 5); // 5,10
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%divisor ==0){
                answer.add(arr[i]);
            }
        }
        int[] ans = new int[answer.size()];
        Iterator<Integer> itr = answer.iterator();
        int i = 0;
        while (itr.hasNext()){
            ans[i] = itr.next();
            i ++;
        };
        Arrays.sort(ans);
        if (ans.length !=0 ){
            return ans;
        }
        return new int[]{-1};

    }
}
