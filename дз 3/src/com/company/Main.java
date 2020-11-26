package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 20, -18, -22, 3, 8, 12, -15, 14, -2, 11, -9, -17, 24, 7};
        double sum = 0;
        int kolichestvo = 0;
        boolean выключатель = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                выключатель = true;
            }
            if (выключатель==true && arr[i] > 0) {
                sum = sum + arr[i];
                kolichestvo++;
            }
        }

        System.out.println(sum / kolichestvo);
    }
}


