package com.migorithm.PlayData;

public class Conversion {
    public static void main(String[] args) {
        // 스트링을 인트로 바꾸고 싶다.
        String aa = "123";
        int bb = Integer.parseInt(aa); // -> int
        System.out.println(bb);

        Integer cc = Integer.valueOf(aa);  // -> Integer

        System.out.println(cc);

        // 인트를 스트링으로 바꾸고 싶다.
        String dd = String.valueOf(cc);
        System.out.println(dd);


    }
}
