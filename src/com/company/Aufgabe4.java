package com.company;

public class Aufgabe4 {

    public static int billigsteTastatur(int[] arr){ //tastatura cea mai ieftina
        int min = arr[0];
        for(int i = 1 ; i < arr.length; ++i) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int teuersteGegenstand(int[] arr1, int[] arr2){ //cel mai scump obiect
        int max = -1;
        for (int j : arr1) {
            if (j > max)
                max = j;
        }
        for (int j : arr2) {
            if (j > max)
                max = j;
        }
        return max;
    }
    public static int teuersteUsb(int[] arr, int Budget){ //cel mai scump USB pe care si l permite
        int max = -1;
        for (int j : arr) {
            if (j > max && j <= Budget)
                max = j;
        }
        return max;
    }
    public static int maximalGeldbetrag(int Budget, int[] arr1 , int[] arr2){ //consumatia maxima posibila
        int max = -1; //-1 daca nu si permite
        for (int k : arr1) {
            for (int i : arr2) {
                int sum = k + i;
                if (sum > max && sum <= Budget) {
                    max = sum;
                }
            }
        }
        return max;
    }

}
