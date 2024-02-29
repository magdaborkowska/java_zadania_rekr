package org.example;

//Napisz program, który sprawdzi czy tekst zaczyna się innym tekstem.
//str = "Java is fun"
//str = Jav -> true
//str = Jam -> false


public class Task25TekstZaczynaSieOdInnegoTekstu {
    public static void main(String[] args) {
        String str = "Java is fun";
        String prefix1 = "Jav";
        String prefix2 = "Jam";

        boolean startsWithPrefix1 = startsWith(str, prefix1);
        boolean startsWithPrefix2 = startsWith(str, prefix2);

        System.out.println("Czy tekst zaczyna się od \"" + prefix1 + "\": " + startsWithPrefix1);
        System.out.println("Czy tekst zaczyna się od \"" + prefix2 + "\": " + startsWithPrefix2);
    }

    public static boolean startsWith(String str, String prefix) {
        return str.startsWith(prefix);
    }
}