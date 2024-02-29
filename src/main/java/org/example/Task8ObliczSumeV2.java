package org.example;

// Napisz program który obliczy sumę wszystkich elementów tablicy liczb całkowitych.
// numbers = {1,2,3,4,5}
// wynik = 15

public class Task8ObliczSumeV2 {
    public static void main(String[] args) {
        // Tablica liczb całkowitych
        int[] numbers = {1, 2, 3, 4, 5};

        // Obliczenie sumy elementów tablicy
        int sum = calculateSum(numbers);

        // Wyświetlenie wyniku
        System.out.println("Suma elementów tablicy: " + sum);
    }

    // Metoda obliczająca sumę elementów tablicy
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
