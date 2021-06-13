package com.migorithm.practice.learning;

import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        //size check -> through .size()
        Stack st = new Stack();
        Queue q = new LinkedList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        q.offer("1");
        q.offer("2");
        q.offer("3");
        q.offer("4");

        Deque deq  = new ArrayDeque();


        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
        int i = 0;

        while (deq.size() <= 10){
            deq.offerFirst(i);
            deq.offerLast("var" + i);
            i +=1;
        }
        System.out.println(deq);

    }
}
