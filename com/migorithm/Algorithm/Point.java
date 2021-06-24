package com.migorithm.Algorithm;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point otherxy){
        double Distx = x - otherxy.getX();
        double Disty = y - otherxy.getY();
        return Math.sqrt(Math.pow(Distx,2) + Math.pow(Disty,2));
    }


}
