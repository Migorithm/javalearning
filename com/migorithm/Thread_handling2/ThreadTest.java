package com.migorithm.Thread_handling2;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        myThread[] threads = new myThread[5];
        for (int i =1 ; i<=threads.length;i++){
            threads[i-1] = new myThread(i);
        }
        Thread[] set_thread = new Thread[threads.length];

        for (int i =1 ; i<=set_thread.length;i++){
            set_thread[i-1] = new Thread(threads[i-1]);
        }
        for (int i =1 ; i<=set_thread.length;i++){
            set_thread[i-1].start();
        }
    }
}
