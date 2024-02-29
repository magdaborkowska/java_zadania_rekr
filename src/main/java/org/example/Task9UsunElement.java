package org.example;

// Napisz program który usunie dany element z tablicy liczb całkowitych.
// numbers = {1,2,3,5,6}
// liczba do usunięcia: 5
// wynik = {1,2,3,6}

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task9UsunElement {
    public static void main(String[] args) {
        // Tablica liczb całkowitych
        int[] numbers = {1, 2, 3, 5, 6};

        // Liczba do usunięcia
        int numberToRemove = 5;

        // Wywołanie funkcji usuwającej element
        int[] result = removeElement(numbers, numberToRemove);

        // Wyświetlenie wyniku
        System.out.println("Wynik po usunięciu elementu " + numberToRemove + ": " + Arrays.toString(result));
    }

    // Metoda usuwająca określoną liczbę z tablicy
    public static int[] removeElement(int[] arr, int elementToRemove) {
        List<Integer> resultList = new ArrayList<>();

        // Dodanie do listy wszystkich elementów różnych od elementToRemove
        for (int num : arr) {
            if (num != elementToRemove) {
                resultList.add(num);
            }
        }

        // Konwersja listy na tablicę
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}


