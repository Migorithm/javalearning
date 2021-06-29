package com.migorithm.PlayData.Shape;

public abstract class Shape {
    private int length;
    private int width;
    private String colors;

    public Shape() {};
    public Shape(int length,int width,String colors) {
        this.length = length;
        this.width = width;
        this.colors = colors;
    };
    public abstract double getArea();

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
}
