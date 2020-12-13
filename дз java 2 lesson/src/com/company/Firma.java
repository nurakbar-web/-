package com.company;

public class Firma {
    private String name;
    private String addres;
    private ShtrihKod shtrihKod;
    private Tavarxxx tavarxxx;

    public Firma(String name, String addres, ShtrihKod shtrihKod, Tavarxxx tavarxxx) {
        this.name = name;
        this.addres = addres;
        this.shtrihKod = shtrihKod;
        this.tavarxxx = tavarxxx;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return addres;
    }

    public ShtrihKod getShtrihKod() {
        return shtrihKod;
    }

    public Tavarxxx getTavarxxx() {
        return tavarxxx;
    }
}
