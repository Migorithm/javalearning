package com.migorithm.PlayData.Inheritance;

public class Compare extends Object{
    private int a;
    public Compare(int a){
        this.a = a;
    }


    public boolean equals(Compare x){
        return this.a == x.a;
    }

    public static void main(String[] args) {
        Compare a = new Compare(10);
        Compare b = new Compare(20);
        System.out.println(a.equals(b));
    }
}
