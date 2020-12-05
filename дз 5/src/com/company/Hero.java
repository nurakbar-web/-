package com.company;

public class Hero {
    private int health;
    private int heroAttack;
    private String superPower;

    public Hero (){}

    public Hero( int health, int heroAttack, String superPower){

        this.health = health;
        this.heroAttack = heroAttack;
        this.superPower = superPower;
    }
    public Hero(int health, int heroAttack){

        this.health = health;
        this.heroAttack = heroAttack;
    }

    public int getHealth() {
        return health;
    }

    public int getHeroAttack() {
        return heroAttack;
    }

    public String getSuperPower() {
        return superPower;
    }
}
