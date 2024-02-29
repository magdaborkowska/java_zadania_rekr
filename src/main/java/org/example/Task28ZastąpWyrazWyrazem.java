package org.example;

// Napisz program który zastąpi wskazany wyraz w zdaniu innym wyrazem.
// Przykład: Szybki brązowy lis przeskakuje nad leniwym psem.
// Zastąp słowo lis słowem kot.
// Rezultat: Szybki brązowy kot przeskakuje nad leniwym psem.


public class Task28ZastąpWyrazWyrazem {
    public static void main(String[] args) {
        String sentence = "Szybki brązowy lis przeskakuje nad leniwym psem.";
        String targetWord = "lis";
        String replacementWord = "kot";

        String result = replaceWord(sentence, targetWord, replacementWord);

        System.out.println("Rezultat: " + result);
    }

    public static String replaceWord(String sentence, String targetWord, String replacementWord) {
        return sentence.replaceAll("\\b" + targetWord + "\\b", replacementWord);
    }
}