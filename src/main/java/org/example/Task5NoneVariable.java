package org.example;

// Zamień miejscami pierwszą i ostatnią liczbę w tablicy nie używając zmiennych pomocniczych
// tablica: [1,3,5,4]
// wynik: [4,3,5,1]

public class Task5NoneVariable {
    public static void main(String[] args) {

        int[] numbers = {1,3,5,4};

        numbers[0] = numbers[0] + numbers[numbers.length-1];
        numbers[numbers.length-1] = numbers[0] - numbers[numbers.length-1];
        numbers[0] = numbers[0] - numbers[numbers.length-1];

        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}