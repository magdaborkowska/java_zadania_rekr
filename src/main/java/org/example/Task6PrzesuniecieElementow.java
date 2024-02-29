package org.example;

// Napisz program który przesunie wszystkie elementy tablicy o jedno miejsce w lewo.
// tabl = {10,30,50}
// wynik = {30,50,10}

import java.util.Arrays;

public class Task6PrzesuniecieElementow {
    public static void main(String[] args) {

        int[] tabl = {10,30,50};
        int[] wynik = new int[3];

        for(int i = 0; i < tabl.length; i++) {
            if(i == 0) {
                wynik[wynik.length-1] = tabl[0];
            } else {
                wynik[i-1] = tabl[i];
            }
        }
        
        System.out.println("wynik = " + Arrays.toString(wynik));
    }
}