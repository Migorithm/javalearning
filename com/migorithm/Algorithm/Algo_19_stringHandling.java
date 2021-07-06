package com.migorithm.Algorithm;

import org.apache.commons.lang3.StringUtils;



public class Algo_19_stringHandling {
    public static void main(String[] args) {
        Algo_19_stringHandling A = new Algo_19_stringHandling();
        System.out.println(A.solution("2333"));
    }


    public boolean solution(String s) {

        if((s.length() == 4|| s.length() == 6) && !s.contains(" ")){
            try{
                Double.parseDouble(s);
                return true;
            }catch (NumberFormatException e){
                return false;
            }
        }
        return false;
    }}

