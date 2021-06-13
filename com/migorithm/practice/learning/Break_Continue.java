package com.migorithm.practice.learning;

import java.util.*;

public class Break_Continue {
    public static void main(String[] args) {
        String[] names = {"Anna","Ali","Bob","Mike"};
        Deque deq = new ArrayDeque();

        for (String name : names){
            if (name.startsWith("A")){
                deq.offerFirst(name);
                continue;
            }
            else if (name.endsWith("e")){
                deq.pollFirst();
                deq.offerFirst(name);
                break;
            }
            System.out.println(name);

            }
        System.out.println(deq);
        }
    }

