package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setBossAttac(50);
        boss.setProtection("Magic");
        System.out.println(boss.getHealth()
                + "- Boss health "
                + boss.getBossAttac() + "- Boss attack "
                + boss.getProtection() + "- Boss protection");




    }
}
