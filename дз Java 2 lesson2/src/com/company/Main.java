package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Авчарка", 1, "Мухтар", "атака");
        Cat cat = new Cat("Сиянская", 1, "" + "радуга", "Черная");
        Pig pig = new Pig("английская свиннья", 2, "Плюха", 225);
       // System.out.println(cat.print() + " " + dog.print() + " " + pig.print());
       // System.out.println(createObject(dog.print()));
        createObject("Cat").print();

    }

    public static Animal createObject(String className) {
        if (className.equals(Cat.class.getSimpleName())) {
            return new Cat("Сфинск ", 1, "" + "радуга", "Черная");


        } else if (className.equals(Pig.class.getSimpleName())) {
            return new Pig("английская свиннья", 2, "Плюха", 225);


        } else if (className.equals(Dog.class.getSimpleName())) {
            return new Dog("Авчарка", 1, "Мухтар", "атака");
        } else {
            return null;

        }
    }

}









