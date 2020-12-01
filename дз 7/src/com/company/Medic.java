package com.company;

public class Medic extends Hero {
    public Medic(int health, int damag, String sS) {
        super(health, damag, sS);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(" медик" + " " + getsS() + superAbilityType);
    }
}
