package org.example;

// Napisz program który usunie powtorki
// Przykład "Java is is fun"
// Rozwiązanie "Java is fun"


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringJoiner;

public class Task31UsunPowtorkiSET {
    public static void main(String[] args) {
        String sentence = "Java is is fun";

        String result = removeDuplicates(sentence);

        System.out.println("Rozwiązanie: " + result);
    }

    public static String removeDuplicates(String sentence) {
        Set<String> wordSet = new LinkedHashSet<>();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            wordSet.add(word);
        }

        return String.join(" ", wordSet);
    }
}