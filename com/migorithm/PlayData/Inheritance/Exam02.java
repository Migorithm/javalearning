package com.migorithm.PlayData.Inheritance;

import java.util.Scanner;
/*문제 str을 받은 cnvr을 조작해보자.
 * 1) 전체를 대문자로 추력
 * 2) 전체를 소문자로 출력
 * 3) 공백을 제거 후 출력
 * 4) 공백을 찾아 하트로 출력
 * 5) 입력된 글자를 삭제 후 출력 = Scanner를 사용.
 * 6) getBytes, 문자열을 하나씩 바이트로 변환 후 출력
 * 7) 문자열을 공백으로 분철해서 분철된 데이터를 출력하자.
 */
public class Exam02 {
    public static void cnvr(String res) {
        //1)
        System.out.println("1번 문제!");
        System.out.println(res.toUpperCase());
        //2)
        System.out.println("\n\n2번 문제!");
        System.out.println(res.toLowerCase());
        //3)
        System.out.println("\n\n3번 문제!");
        System.out.println(res.replace(" ", ""));
        //4)
        System.out.println("\n\n4번 문제!");
        System.out.println(res.replace(" ", "♥"));
        //5)
        System.out.println("\n\n5번 문제!");
        Scanner c1 = new Scanner(System.in);
        String str = c1.nextLine();
        System.out.println(res.replace(str, ""));
        //6)
        System.out.println("\n\n6번 문제!");
        for (Byte i : res.getBytes()) {System.out.println(i);}
        //7)
        System.out.println("\n\n7번 문제!");
        String [] strArray = res.split(" ");
        for (String i : strArray) {System.out.println(i);}
    }
    public static void main(String[] args) {
        String str = "The String class represents character strings.";
        cnvr(str);
    }
}