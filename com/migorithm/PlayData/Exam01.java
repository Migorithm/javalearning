package com.migorithm.PlayData;


/*cnvr() 메소드로 대입해서
 * 1) 대문자의 개수 & 소문자의 개수를 출력하고
 * 2) 대문자를 소문자로, 소문자를 대문자로 변환 후 리턴받는다.
 */
public class Exam01 {
    public static String cnvr(String res) {
        int small = 0;
        int capital = 0;
        String answer ="";
        for (char ch : res.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                small += 1;
                answer += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                capital += 1;
                answer += Character.toLowerCase(ch);
            }
        }
        System.out.println("Small letters :" + small);
        System.out.println("Capital letters :" + capital);
        return answer;
    }
    public static void main(String[] args) {
        String str = "The String class represents character strings.";
        String res = cnvr(str);
        System.out.println(res);
    }
}