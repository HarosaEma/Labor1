package com.company;

public class Aufgabe1 {

    public static int[] Nicht_Ausreichend(int[] arr){ //notele insuficente
        int[] array;
        array = new int[30];
        int index = 0;
        for (int j : arr) {
            if (j < 38) {
                array[index] = j;
                index++;
            }
        }
        return arr;
    }
    public static int DurschnittsNote(int[] arr){ //media
        int suma = 0;
        for (int j : arr) {
            suma += j;
        }
        suma /= arr.length; //functie pentru lungimea sirului
        return suma;
    }
    public static int[] Aufgerundet(int [] arr){ //notele rotunjite
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] % 5 < 3 && arr[i] >= 38) {
                arr[i] += 5- arr[i] % 5;
            };
        }
        return arr;
    }
    public static int MaximalNote(int[] arr){
        Aufgerundet(arr);
        int maximal = -1;
        for (int j : arr) {
            if (j > maximal) maximal = j;
        }
        return maximal;
    }

}
