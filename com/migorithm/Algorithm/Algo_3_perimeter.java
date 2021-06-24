package com.migorithm.Algorithm;

public class Algo_3_perimeter {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(5,3);
        Point p3 = new Point(1,7);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(p3));
        System.out.println(p2.distance(p3));
    }
}
