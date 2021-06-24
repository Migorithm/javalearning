package com.migorithm.anno;

public class Test02 {

    @FilledAnnotation(name = "Jake")
    private static final int THING =3;

    @EmptyAnnotation
    public static void main(String[] args) {

    }

    @FilledAnnotation(value=22) //you can override default value as well.
    public static void doSomething(){
        System.out.println("weweq");
    }
}
