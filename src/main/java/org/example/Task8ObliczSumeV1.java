package org.example;

// Napisz program który obliczy sumę wszystkich elementów tablicy liczb całkowitych.
// numbers = {1,2,3,4,5}
// wynik = 15

public class Task8ObliczSumeV1 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int suma = 0;

        for (int number : numbers){
            suma += number;
        }
        System.out.println("suma " + suma);
    }
}