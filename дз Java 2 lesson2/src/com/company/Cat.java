package com.company;

public class Cat extends Animal  {

    private String collor;            // цвет
    public Cat(String paroda, int age, String name, String collor) {
        super(paroda, age, name);
        this.collor = collor;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    @Override
    public String print() {

        return (getParoda() + " " + getName() + " " + getAge() + " " +getCollor());
    }
}
