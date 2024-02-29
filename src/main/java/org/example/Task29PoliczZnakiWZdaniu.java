package org.example;

// Napisz program który policzy występowanie znaku w zdaniu.
// Przykład: Szybki brązowy lis przeskakuje nad leniwym psem.
// Sprawdzamy ile razy występuje znak l -> 2 razy


public class Task29PoliczZnakiWZdaniu {
    public static void main(String[] args) {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem.";
        char targetChar = 'l';

        int occurrences = countCharacterOccurrences(sentence, targetChar);

        System.out.println("Znak '" + targetChar + "' występuje " + occurrences + " razy.");
    }

    public static int countCharacterOccurrences(String sentence, char targetChar) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == targetChar) {
                count++;
            }
        }
        return count;
    }
}