package com.migorithm.practice.learning;



public class Classes_Objects {
    public static void main(String[] args) {
        // Classes and Objects
        Lens lensOne = new Lens("Sony","85mm",true);
        Lens lensTwo = new Lens("Sony","75mm",false);
    }
    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand,
             String focalLength,
             boolean isPrime){
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

    }


}
