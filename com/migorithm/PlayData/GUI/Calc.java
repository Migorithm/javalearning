package com.migorithm.PlayData.GUI;

public class Calc {
    private int a;
    private int b;
    private int hap;
    private int sub;
    private int mul;
    private int div;

    public Calc() {
    }

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getHap() {
        this.hap = this.a + this.b;
        return this.hap;
    }

    public int getSub() {
        this.sub = this.a - this.b;
        return this.sub;
    }

    public int getMul() {
        this.mul = this.getA() * this.getB();
        return this.mul;
    }

    public double getDiv() {
        return (double)this.getA()/(double)this.getB();
    }

    public String toString() {
        return String.format("Calc [a=%s, b=%s, getHap()=%s, getSub()=%s, getMul()=%s, getDiv()=%s]", this.a, this.b, this.getHap(), this.getSub(), this.getMul(), this.getDiv());
    }


}
