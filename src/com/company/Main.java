package com.company;

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[]{2,2,3,4,7,8,9};
        int[] arr1 = new int[]{8,6,7,8,9,6,5};
        int [] tastatura = new int[]{40,50,60}; //preturile pentru tastatura(aufgabe4)
        int [] USB = new int[]{9,5,11,10}; //preturile pentru USB(aufgabe4)
        //System.out.println(java.util.Arrays.toString(arr));
        //System.out.println(java.util.Arrays.toString(Aufgabe3.Multiplikation(arr,5)));
        //System.out.println(java.util.Arrays.toString(Aufgabe3.Summe(arr,arr1)));
        System.out.println(Aufgabe4.maximalGeldbetrag(44,tastatura,USB)); //functie de printare

    }
}
