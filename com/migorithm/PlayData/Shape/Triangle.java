package com.migorithm.PlayData.Shape;

public class Triangle extends Shape implements Resize {


    public Triangle() {
        super();
    }
    public Triangle(int length,int width, String colors) {
        super(length, width,colors);

    }
    @Override
    public double getArea() {
        double answer = (double)(this.getWidth()*this.getLength())/2;
        return answer;
    }



    @Override
    public void setResize(int a) {
        this.setLength(this.getLength()+a);

    }


}