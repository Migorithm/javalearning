package com.migorithm.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
public class Algo_34_MathQuitter {
    public static void main(String[] args) {
        Algo_34_MathQuitter A = new Algo_34_MathQuitter();
        int[] answer = A.solution(new int[]{1,3,2,4,2});
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[] answers) {
        ArrayList<Integer> one = new ArrayList<>(); //1,2,3,4,5
        ArrayList<Integer> two =new ArrayList<>(); //2,1,2,3,2,4,2,5
        ArrayList<Integer> three=new ArrayList<>(); // 3,3,1,1,2,2,4,4,5,5
        for(int i = 0;i< answers.length;i++){
            if ((i+1)%5 != 0){
                one.add((i+1)%5);
            }
            else {one.add(5);}
        }
        while (two.size()< answers.length){
            two.add(2);
            two.add(1);
            two.add(2);
            two.add(3);
            two.add(2);
            two.add(4);
            two.add(2);
            two.add(5);
            three.add(3);
            three.add(3);
            three.add(1);
            three.add(1);
            three.add(2);
            three.add(2);
            three.add(4);
            three.add(4);
            three.add(5);
            three.add(5);
        }
        while(two.size() != answers.length){
            two.remove(two.size()-1);
        }
        while(three.size() != answers.length){
            three.remove(three.size()-1);
        }
        ArrayList<Integer> ansList = new ArrayList<>();
        for (int answer : answers) {
            ansList.add(answer);
        }
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i =0; i<ansList.size();i++){
            if (ansList.get(i) == one.get(i)){
                cnt1++;
            }
            if (ansList.get(i) == two.get(i)){
                cnt2++;
            }
            if (ansList.get(i) == three.get(i)){
                cnt3++;
            }
        }
        int[] answ = new int[] {cnt1,cnt2,cnt3};
        ArrayList<Integer> answersheet = new ArrayList<>();
        if(cnt1 == Arrays.stream(answ).max().getAsInt()){
            answersheet.add(1);
        }
        if(cnt2 == Arrays.stream(answ).max().getAsInt()){
            answersheet.add(2);
        }
        if(cnt3 == Arrays.stream(answ).max().getAsInt()){
            answersheet.add(3);
        }

        int[] fin = new int[answersheet.size()];
        for (int i = 0; i < fin.length;i++){
            fin[i] = answersheet.get(i);
        }
        return fin;
    }
}
