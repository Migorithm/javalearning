package com.migorithm.practice.learning;

public class Classes_Objects2 {
    public static void main(String[] args) {
        Person Alex = new Person("Alex","172",true);
        Toy Dog = new Toy("DoggyDoggy",100000);
        Alex.toy = Dog;
        Alex.toy.intro();
    }
    static class Person{
        String name;
        String height;
        Boolean isSitting = true;
        Toy toy;
        Person(String name, String height, Boolean isSitting){
            this.name = name;
            this.height = height;
            this.isSitting = isSitting;
        }
    }
    static class Toy{
        String name;
        int price;
        Toy(String name, int price){
            this.name = name;
            this.price = price;
        }
        public void intro(){
            System.out.println("Hi! my name is " + this.name);
            if (this.price > 10_000){
                System.out.println("I'm very expensive! :" +this.price +"won.");}
            else{
                System.out.println("I'm just as cheap as " + this.price +"won." );
        }
        }
    }
}
