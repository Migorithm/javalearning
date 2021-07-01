package com.migorithm.PlayData.Collection_Handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class Array_list {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("d132");
        arr.add(11);
        arr.add(true);

        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        arr.forEach(System.out::println);

        arr.stream().forEach(System.out::println);

    }
}
