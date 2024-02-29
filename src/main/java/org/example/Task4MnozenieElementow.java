package org.example;

// Majac dwie tablice tej samej długości, pomnóż odpowiadające sobie elementy.
// tabl1 = {1,3,5,4}
// tabl2 = {1,4,5,2}
// wynik = {1,12,25,8}

import java.util.Arrays;

public class Task4MnozenieElementow {
    public static void main(String[] args) {

        int[] tabl1 = {1,3,5,4};
        int[] tabl2 = {1,4,5,2};
        int[] wynik = new int[4];

        for(int i = 0; i < tabl1.length; i++) {
            wynik[i] = tabl1[i] * tabl2[i];
        }

        System.out.println("wynik = " + Arrays.toString(wynik));
    }
}