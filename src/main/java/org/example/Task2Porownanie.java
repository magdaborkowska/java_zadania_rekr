package org.example;

// Sprawdź czy pierwszy i ostatni element tablicy 1 zawierającej liczby, jest taki sam jak pierwszy i ostatni element drugiej tablicy.

public class Task2Porownanie {
    public static void main(String[] args) {

        int[] num1 = {1,2,4,3};
        int[] num2 = {1,4,7,3};

        if(num1[0] == num2[0] && num1[num1.length-1] == num2[num2.length-1]) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}