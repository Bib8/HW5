package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        double[] arrDouble = new double[]{1.57, 7.654, 9.986};
        int[] arrRand = {4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else System.out.println(arr[i] + " ");
        }

        for (int i = 0; i < arrDouble.length; i++) {
            if (i != arrDouble.length - 1) {
                System.out.print(arrDouble[i] + ",");
            } else System.out.println(arrDouble[i] + " ");
        }

        for (int i = arr.length -1 ; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ",");
            } else System.out.println(arr[i] + " ");
        }
    }
}
