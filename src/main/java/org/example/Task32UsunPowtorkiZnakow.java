package org.example;

// Napisz program który usunie powtorki
// Przykład aaabbbcccdddeeefff
// Rozwiązanie abcdef


import java.util.HashSet;
import java.util.StringJoiner;

public class Task32UsunPowtorkiZnakow {
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeefff";

        String result = removeDuplicates(str);

        System.out.println("Rozwiązanie: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (i == 0 || currentChar != str.charAt(i - 1)) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}