package com.company;

public class Mag extends Hero {
    public Mag(int health, int damag, String sS) {
        super(health, damag, sS);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getsS() + " мага  " + superAbilityType );

    }
}
