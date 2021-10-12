package com.company;

public class Aufgabe2 {

    public static int maximal(int[] arr){ //maximul
        int max = -1;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
    public static int minimal(int[] arr){ //minimul
        int min = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int MaximalSumme(int[] arr){ //suma maxima = suma-minimul
        int summe = 0;
        for (int j : arr) summe += j;
        summe -= minimal(arr);
        return summe;
    }
    public static int MinimalSumme(int[] arr){ //suma minima=suma-maximul
        int summe = 0;
        for (int j : arr) summe += j;
        summe -= maximal(arr);
        return summe;
    }

}
