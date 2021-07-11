package com.migorithm.Algorithm;
//https://programmers.co.kr/learn/courses/30/lessons/12926?language=java

/*

공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.

"AB"	    1    "BC"
"z"	        1    "a"
"a B z"	    4	"e F d"
 */

import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;


public class Algo_31_Ceaser {
    public static void main(String[] args) {
        Algo_31_Ceaser A = new Algo_31_Ceaser();
        System.out.println(A.solution("a B z",4));
    }
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((int)chars[i] ==32){
                answer.append(chars[i]);
            }
            else if ((int)chars[i] < 91 ){
                if ((int)chars[i] + n <91){
                    answer.append( (char) ((int)chars[i] +n) );
                }
                else {
                    answer.append((char) ((int)chars[i] +n - 26));
                }
            }
            else if ((int)chars[i] < 123 ){
                if ((int)chars[i] + n <123){
                    answer.append( (char) ((int)chars[i] +n) );
                }
                else {
                    answer.append((char) ((int)chars[i] +n - 26));
                }
        }}
        return answer.toString();
    }

}
