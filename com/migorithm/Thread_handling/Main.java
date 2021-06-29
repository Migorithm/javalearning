package com.migorithm.Thread_handling;

public class Main {
    public static void main(String[] args) {
/*  multithreading = Process of executing multiple threads simultaneously helps maximum utilization of CPU.
                    Threads are independent, they don't affect the execution of other threads. An exception in one thread will not
                    interrupt other threads. It's useful for serving multiple clients, multiplayer games or other mutually independent taks.s
 */
        //First way : create a subclass of Thread
        MyThread thread1 = new MyThread();

        //Second way: you create class that inherit 'runnable' interface, passing that instance to the constructor of Thread class.
        // People tend to use runnable interface more.
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1); //within the parenthesis of thread, just place runnable instance. this is a way of creaing a thread.

        thread1.start();   //they are both running at the same time!
        thread2.start();


    /* one of the great things about multi-threading is that if one of these threads encounters an exception and gets interrupted the other threat
        still will continue.

     */
    }
}
