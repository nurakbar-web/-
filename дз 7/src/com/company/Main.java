package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(100 , 0 , "Лечит ");
        Woin woin = new Woin(5, 6, "Огненной мечь ");
        Mag mag = new Mag(350 , 25 , "силовое поле ");

        HavingSuperAbility[] havingSuperAbilities = {medic, woin, mag};

        for (HavingSuperAbility havingSuperAbility : havingSuperAbilities)
            havingSuperAbility.applySuperAbility(" !!! ");

    }
}
