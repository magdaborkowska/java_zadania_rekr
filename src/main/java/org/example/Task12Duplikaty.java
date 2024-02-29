package org.example;

//Napisz program java który znajdzie takie same wartości w tablicy liczb całkowitych.
//        tablica : [1,2,3,2,3,4,5,6,6]

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task12Duplikaty {
    public static void main(String[] args) {
        // Tablica liczb całkowitych
        int[] numbers = {1, 2, 3, 2, 3, 4, 5, 6, 6};

        // Wywołanie funkcji znajdującej duplikaty
        findDuplicatesWithStream(numbers);
    }

    // Metoda znajdująca duplikaty w tablicy przy użyciu Stream
    public static void findDuplicatesWithStream(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Tablica jest pusta.");
            return;
        }

        // Użyj strumieni do grupowania elementów i zliczania wystąpień
        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Filtruj tylko te, które wystąpiły więcej niż raz
        Map<Integer, Long> duplicates = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Wyświetlenie wyniku
        System.out.println("Duplikaty w tablicy:");

        duplicates.forEach((key, value) ->
                System.out.println(key + " - liczba wystąpień: " + value));
    }
}



