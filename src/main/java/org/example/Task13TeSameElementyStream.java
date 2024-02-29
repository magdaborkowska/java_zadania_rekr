package org.example;

//Napisz program java który znajdzie takie same wartości w tablicy liczb całkowitych.
//        tablica1 : ['a','b','c','d','e']
//        tablica2 : ['b','e']

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Task13TeSameElementyStream {
    public static void main(String[] args) {
        Character[] array1 = {'a', 'b', 'c', 'd', 'e'};
        Character[] array2 = {'b', 'e'};

        findCommonElements(array1, array2);
    }
    public static void findCommonElements(Character[] arr1, Character[] arr2) {
        // Konwersja tablic do zbiorów dla łatwiejszej manipulacji
        Set<Character> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Character> set2 = new HashSet<>(Arrays.asList(arr2));

        // Użycie strumieni do znalezienia wspólnych elementów
        Set<Character> commonElements = set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());

        System.out.println("Wspólne elementy w tablicach:");
        commonElements.forEach(System.out::println);
    }
}


