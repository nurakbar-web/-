package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Авчарка", 1, "Мухтар", "атака");
       Cat cat = new Cat("Сиянская", 1, "" + "радуга", "Черная");
       Pig pig = new Pig("английская свиннья", 2, "Плюха", 225);
        System.out.println( dog + " ____________"+ cat + "__________ "+ pig+".");
    }
}

