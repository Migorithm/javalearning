package com.migorithm.PlayData.Shape;

public class Rectangle extends Shape implements Resize {

    public Rectangle() {
    }

    public Rectangle(int length, int width, String colors) {
        super(length, width, colors);

    }

    @Override
    public double getArea() {
        double answer = this.getWidth()*this.getLength();
        return answer;
    }

    @Override
    public void setResize(int a) {
        this.setWidth(this.getWidth() + a);

    }

}