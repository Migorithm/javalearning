package com.migorithm.PlayData;

public class If_and_function {
    public static void main(String[] args) {
        int first = f(3,4);
        int second = f(first,5);
        System.out.println(second);

    }
    static int f (int x,int y) {
        if (x < y) {
            System.out.println("X truly is smaller than y");
            return x + y;
        } else {
            System.out.println("x is not smally than y");
            if (x > 10) {
                return y + 7;
            }
        }
        return x - 2;
    }
}
