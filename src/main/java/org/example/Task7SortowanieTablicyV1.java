package org.example;

import java.util.Arrays;

public class Task7SortowanieTablicyV1 {
    public static void main(String[] args) {
        // Tablica do posortowania
        int[] numbers = {4, 6, 2, 3, 7, 8, 1, 9, 0};

        // Wywołanie funkcji sortującej
        sortArray(numbers);

        // Wyświetlenie posortowanej tablicy
        System.out.println("Posortowana tablica: " + Arrays.toString(numbers));
    }

    // Metoda sortująca tablicę przy użyciu wbudowanej funkcji sort
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}
