package com.migorithm.PlayData;

public class Function_call {
    public static void main(String[] args) {
        double dist1 = distance(7,8);
        if (dist1 > 9){
            System.out.println("너무 멀어");
        }
        else {
            System.out.println("가깝네");
    }}
    public static double distance(int x,int y){
        int standX = 0;
        int standY = 0;
        double xDistance = x - standX;
        double yDistance = y - standY;
        return Math.sqrt(Math.pow(xDistance,2) + Math.pow(yDistance,2));
    }
}




