package org.example;

// Sprawdź czy w tablicy zawierającej liczby, pierwszy i ostatni element są takie same
// tablica = [1,2,4,1] - true
// tablica = [1,2,4,5] - false

public class Task1Porownanie {
    public static void main(String[] args) {

        int[] numbers = {1,2,4,1};

        if(numbers[0] == numbers[numbers.length-1]) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}