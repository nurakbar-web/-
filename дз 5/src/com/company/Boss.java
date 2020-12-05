package com.company;

public class Boss {
    private int health;
    private int bossAttac;
    private String protection;

    public Boss (){}

    public Boss(int health, int bossAttac, String protection){
        this.health = health;
        this.bossAttac = bossAttac;
        this.protection = protection;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBossAttac() {
        return bossAttac;
    }

    public void setBossAttac(int bossAttac) {
        this.bossAttac = bossAttac;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }
}

