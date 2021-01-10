package com.company;

public class Car <T extends Number, S extends Number >implements Drawble {
    private T tayota;
        private S honda;

    public Car(T tayota, S honda) {
        this.tayota = tayota;
        this.honda = honda;
    }

    public T getTayota() {
        return tayota;
    }

    public S getHonda() {
        return honda;
    }

    @Override
    public void draw() {
        System.out.println(" \uD83D\uDE97");
    }
}
