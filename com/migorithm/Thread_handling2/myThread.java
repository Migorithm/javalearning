package com.migorithm.Thread_handling2;

public class myThread implements Runnable{
    private int a;

    public myThread(int a){
        super();
        this.a = a;
    }

    @Override
    public String toString() {
        return "myThread" + this.a;
    }

    @Override
    public void run() {
        for (int i =0 ; i<10; i++){
            System.out.println(toString() + ": " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
    }
}
