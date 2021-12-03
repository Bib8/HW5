package com.company;

public class Main {

    public static void main(String[] args) {

       /* int[] arr = new int[]{1, 2, 3};
        double[] arrDouble = new double[]{1.57, 7.654, 9.986};
      //  int[] arrRand = {4, 5, 6};

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
// Ex 3 rotation
        for (int i = arr.length -1 ; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ",");
            } else System.out.println(arr[i] + " ");
        }

        for (int i = arrDouble.length -1 ; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrDouble[i] + ",");
            } else System.out.println(arrDouble[i] + " ");
        }

//Ex 4 odd to even
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ",");
            } else System.out.println((arr[i] + 1) + " ");
        }*/
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int[] arr = generateRandomArray();
        int sum = arraySum(arr);
        int max = maxInt(arr);
        int min = minInt(arr);
        float avg = avgInt(arr);



        System.out.println("Сумма =" + sum);
        System.out.println("максимальное число =" + max);
        System.out.println("минимальное число =" + min);
        System.out.println("среднее значение =" + avg);
        System.out.println("среднее значение =" + avg);



    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int buf = arr[i] + sum;
            sum = buf;
        }
        return sum;
    }

    public static int maxInt(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minInt(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static float avgInt(int[] arr) {
        int sum = arraySum(arr);
        float avg = (float) sum / arr.length;
        return avg;
    }


}
