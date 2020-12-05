package com.company;

public class Main {

    public static void main(String[] args) {

        Boss Boss = new Boss();
        Boss.setName("AID:");
        Boss.setAttack(250);
        Boss.setHealth(2500);

        Weapon weapon = new Weapon();
        weapon.setWeaponType(" магический  посох  "); // Тип оружия
        weapon.setWeaponName("призрочный посох"); // Имя оружия

        Boss.setWeapon(weapon);
        System.out.println(Boss.getName()
                + " урон: " + Boss.getAttack()
                + " |Жизнь:  " + Boss.getHealth()
                + " |тип оружия: " + Boss.getWeapon().getWeaponType()
                + " |имя оружия: " + Boss.getWeapon().getWeaponName());

    }
}
