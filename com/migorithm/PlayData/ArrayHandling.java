package com.migorithm.PlayData;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayHandling {
    public static void main(String[] args) {
        int [][] Arr1 = {{1,2,3,4,5}};
        ArrayList<ArrayList<String>> biDemArrList = new ArrayList<ArrayList<String>>();

        ArrayList<String> myString = new ArrayList<String>();
        myString.add("나는 진짜 모르겠다");
        myString.add("이것도 넣을 수 있나?");
        myString.add("해보는거지");

        ArrayList<String> myString2 = new ArrayList<String>();
        myString2.add("될지도 몰라");
        myString2.add("아마도");
        myString2.add("ㄱㄱㄱ");

        biDemArrList.add(myString);
        biDemArrList.add(myString2);
        for (ArrayList a :biDemArrList ){
            ArrayList<String> b = a;
            for (String str : b){
                System.out.println(str);
            }
    }
}}
