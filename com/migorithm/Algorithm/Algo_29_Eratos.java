package com.migorithm.Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Algo_29_Eratos {
    public static void main(String[] args) {
        Algo_29_Eratos A = new Algo_29_Eratos();
        System.out.println(A.solution(100));
    }
    public int solution(int n) {
        ArrayList<Boolean> primeList;
        int given = n;
        if (given <= 1) {
            return 0;
        }
        primeList = new ArrayList<>(n + 1);
        //insert two falses for 0,1
        primeList.add(false);
        primeList.add(false);
        // 2~ n 까지 소수로 설정
        for (int i = 2; i <= given; i++)
            primeList.add(i, true);
        // 2 부터  ~ i*i <= given
        // 각각의 배수들을 지워간다.
        for (int i = 2; (i * i) <= given; i++) {
            if (primeList.get(i)) {
                for (int j = i * i; j <= given; j += i) {
                    primeList.set(j, false);
                }
            }
        }
        return Collections.frequency(primeList, true); //if you want to get frequency of something.
    }
}
