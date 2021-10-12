package com.company;

public class Aufgabe3 {
    public static int[] Summe(int[] arr1, int[] arr2){ //suma
        boolean depasit = false;
        int[] newArr;
        newArr = new int[arr1.length + 1];
        for(int i = arr1.length -1; i >=0; i--){
            int sum = arr1[i] + arr2[i];
            if(depasit){
                sum += 1;
                depasit = false;
            }
            newArr[i + 1] += sum > 9 ? sum % 10 : sum; //verificam daca depaseste sau nu

            if(sum > 9) depasit = true;
        }
        if(depasit) newArr[0] = 1;
        if(newArr[0] == 0) {
            int[] newArr1;
            newArr1 = new int[newArr.length - 1];
            for(int i = 1; i < newArr.length; ++i)
                newArr1[i - 1] = newArr[i];
            return newArr1;
        }
        else
            return newArr;
    }
    public static int[] Differenz(int[] arr1, int[] arr2){ //diferenta
        boolean depasit = false;
        int[] newArr;
        newArr = new int[arr1.length];
        for(int i = arr1.length - 1; i >= 0; i--){
            int dif = arr1[i] - arr2[i];
            if(depasit){
                dif += 1;
                depasit = false;
            }
            newArr[i] += dif < 0 ? -dif : dif; //verificam diferenta

            if(dif < 0) depasit = true;
        }
        return newArr;
    }
    public static int[] Multiplikation(int[] arr1, int cif){ //produsul
        int depasit = 0;
        int[] newArr;
        newArr = new int[arr1.length + 1];
        for(int i = arr1.length - 1; i >= 0; i--){
            int produs = arr1[i] * cif;
            produs += depasit;
            newArr[i + 1] += produs < 10 ? produs : produs % 10; //verificam produsul
            depasit = produs / 10;
        }
        newArr[0] += depasit;
        if(newArr[0] == 0) {
            int[] newArr1;
            newArr1 = new int[newArr.length - 1];
            for(int i = 1; i < newArr.length; ++i)
                newArr1[i - 1] = newArr[i];
            return newArr1;
        }
        else
            return newArr;
    }
    public static int[] Division(int[] arr1, int cif) { //impartirea
        int[] newArr;
        newArr = new int[arr1.length];
        int nr = 0;
        for (int j : arr1) {
            nr *= 10;
            nr += j;
        }
        nr /= cif;
        for (int i = newArr.length - 1; i >= 0; i--) {
            newArr[i] = nr % 10;
            nr /= 10;
        }
        return newArr;
    }
}
