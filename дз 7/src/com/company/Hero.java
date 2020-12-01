package com.company;

abstract public class Hero implements HavingSuperAbility {
    private int health;
    private int damag;
    private String sS;

    public Hero(int health, int damag, String sS) {
        this.health = health;
        this.damag = damag;
        this.sS = sS;
    }

    public int getHealth() {
        return health;
    }

    public int getDamag() {
        return damag;
    }

    public String getsS() {
        return sS;
    }
}
