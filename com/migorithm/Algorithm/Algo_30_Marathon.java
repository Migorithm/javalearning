package com.migorithm.Algorithm;

import java.util.HashMap;

//https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
public class Algo_30_Marathon {
    public static void main(String[] args) {
        Algo_30_Marathon A = new Algo_30_Marathon();
        System.out.println(A.solution(new String[] {"mislav", "stanko", "mislav", "ana"},new String[] {"stanko", "ana", "mislav"}));
    }
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hash = new HashMap<>();
        HashMap<String,Integer> hash2 = new HashMap<>();
        for(String s : participant){
            if (hash.containsKey(s)){
                hash.put(s,hash.get(s) +1);
            }
            else {
                hash.put(s, 1);
            }
        }
        for(String s : completion){
            if (hash2.containsKey(s)){
                hash2.put(s,hash2.get(s) +1);
            }
            else {
                hash2.put(s, 1);
            }
        }
        for(String s : hash.keySet()){
            if(!hash.get(s).equals(hash2.get(s))){
                answer = s;
                break;
            }
        }
        return answer;
    }

}

