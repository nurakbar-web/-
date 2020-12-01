package com.company;

public class Woin extends Hero {
    public Woin(int health, int damag, String sS) {
        super(health, damag, sS);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getsS() + " война  " + superAbilityType);
    }
}
