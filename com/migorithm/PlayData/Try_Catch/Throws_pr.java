package com.migorithm.PlayData.Try_Catch;

public class Throws_pr {
    public static double div(double a,double b) throws ArithmeticException{
        double answer  = a/b;
        return answer ;
    } //any problem that occurs within this method will be addressed by exception following 'throws'

    public static void main(String[] args) {
        try {
            Throws_pr.div(4,0);
        }
        catch(ArithmeticException A){
            System.out.println("0으로 못 나눠요");
        }}}

