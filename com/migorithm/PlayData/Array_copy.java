package com.migorithm.PlayData;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Array_copy {
    public static void main(String[] args) {

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];

        System.arraycopy(copyFrom, 3, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        // 인트를 복사해오자.
        int[] intcopy = {1,2,3,4,5,6,7,8,9,10};
        int[] copys = new int[5];
        System.arraycopy(intcopy, 8,copys,0,2);
        System.out.println(Arrays.toString(copys));

    }
}


