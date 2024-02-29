package org.example;
import java.util.LinkedHashSet;
import java.util.Set;

// Napisz program który usunie powtorki
// Przykład aaabbbcccdddeeefff
// Rozwiązanie abcdef


public class Task32UsunPowtorkiZnakowSET {
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeefff";

        String result = removeDuplicates(str);

        System.out.println("Rozwiązanie: " + result);
    }

    public static String removeDuplicates(String str) {
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : charSet) {
            sb.append(c);
        }

        return sb.toString();
    }
}