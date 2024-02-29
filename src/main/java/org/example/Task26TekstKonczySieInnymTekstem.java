package org.example;

//Napisz program, który sprawdzi czy tekst kończy się innym tekstem.
//str = "Java is fun"
//str = fun -> true
//str = fum -> false


public class Task26TekstKonczySieInnymTekstem {
    public static void main(String[] args) {
        String str = "Java is fun";
        String suffix1 = "fun";
        String suffix2 = "fum";

        boolean endsWithSuffix1 = endsWith(str, suffix1);
        boolean endsWithSuffix2 = endsWith(str, suffix2);

        System.out.println("Czy tekst kończy się na \"" + suffix1 + "\": " + endsWithSuffix1);
        System.out.println("Czy tekst kończy się na \"" + suffix2 + "\": " + endsWithSuffix2);
    }

    public static boolean endsWith(String str, String suffix) {
        return str.endsWith(suffix);
    }
}