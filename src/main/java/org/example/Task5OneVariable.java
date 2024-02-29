package org.example;

// Zamień miejscami pierwszą i ostatnią liczbę w tablicy
// tablica: [1,3,5,4]
// wynik: [4,3,5,1]

public class Task5OneVariable {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,4};
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = temp;

        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}