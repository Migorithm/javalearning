package com.migorithm.PlayData;

public class PointComparison { // 좌표점의 하나를 받아서 인스턴스화 시킨후에  두 인스턴스를 비교해서 거리를 구하는것.
    private int x;
    private int y;

    public PointComparison(int startx ,int starty){
        x = startx;
        y = starty;
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    public double getDistance(PointComparison otherPt){
        double disX = this.x - otherPt.getx();
        double disY = this.y - otherPt.gety();
        return Math.sqrt(Math.pow(disX,2) + Math.pow(disY,2));
    }

    public static void main(String[] args) {
        PointComparison p1 = new PointComparison(3,6);
        PointComparison p2 = new PointComparison(100,300);
        System.out.println(p1.getDistance(p2));
    }


}
