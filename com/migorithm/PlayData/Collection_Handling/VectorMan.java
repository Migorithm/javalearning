package com.migorithm.PlayData.Collection_Handling;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Vector;

import java.util.stream.Stream;

public class VectorMan {

    public static void main(String[] args) {

//It is recommended to use the Vector class in the thread-safe implementation only.
        Vector vec = new Vector(5,3); // this is actually a capacity
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        System.out.println(vec);
        int sum;
        int [] intarr = new int[4];
        sum = vec.stream().mapToInt(x -> (int) x).sum();
        System.out.println(sum);

        Vector<String> vec2 = new Vector<String>(); //형이 지정되어야 람다 적용가능.
        vec2.add("a");
        vec2.add("b");
        vec2.add("c");
        vec2.add("d");
        vec2.add("e");
        vec2.stream().map(x -> (x.toUpperCase())).forEach(System.out::printf);
        System.out.println();

        //map
        vec.stream().map(x -> ((int)x +5)).forEach(System.out::println);

        //filter
        vec.stream().filter(x -> ((int)x > 3)).forEach(System.out::println);

        Object c = vec.stream().reduce((x,y) -> (int)x + (int)y);
        System.out.println(c);



    }
}
