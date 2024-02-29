package org.example;

// Napisz program który usunie powtorki
// Przykład "Java is is fun"
// Rozwiązanie "Java is fun"


import java.util.HashSet;
import java.util.StringJoiner;

public class Task31UsunPowtorki {
    public static void main(String[] args) {
        String sentence = "Java is is fun";

        String result = removeDuplicates(sentence);

        System.out.println("Rozwiązanie: " + result);
    }

    public static String removeDuplicates(String sentence) {
        String[] words = sentence.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (String word : uniqueWords) {
            joiner.add(word);
        }

        return joiner.toString();
    }
}