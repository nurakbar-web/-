package com.company;

public class Car <T extends Number, S extends Number >implements Drawble<T> {
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
    public T Id() {

        return null;
    }
}
