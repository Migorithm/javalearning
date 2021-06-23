package com.migorithm.PlayData;

public class Point_Class_Practice {
    private int x;
    private int y;
    public Point_Class_Practice(int startx, int starty){ //declaration of constructor //note that it has no return
        x = startx;
        y = starty;
    }
    public int getX() {return x;}
    public int getY() {return y;}
    public double distance(Point_Class_Practice otherPt){
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    public static void main(String[] args) {
     Point_Class_Practice p1 = new Point_Class_Practice(3,4);
     Point_Class_Practice p2 = new Point_Class_Practice(6,8);
        System.out.println(p1.distance(p2));
    }
}
