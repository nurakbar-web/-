package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(можно(19, 11));
        System.out.println(можно(22, 15));
        System.out.println(можно(25, 17));
        System.out.println(можно(27, 13));
        System.out.println(можно(22, 19));
    }

    public static String можно(int jaw, int temp) {
        if (jaw > 20 && jaw < 45 && temp > -20 && temp < 30) {
            return "можно идди гулят";
        } else if (jaw < 20 && temp > 0 && temp < 28) {
            return "можно идди гулят";
        } else if (jaw > 45 && temp > -10 && temp < 25) {
            return "можно идди гулят";
        } else {
            return "оставайтесь дома";
        }
    }

}

