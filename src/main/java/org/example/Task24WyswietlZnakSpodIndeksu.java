package org.example;

//Napisz program, który wyświetli znak znajdujący się pod danym indeksem
//str = "Java is fun"
//index 5 = i


public class Task24WyswietlZnakSpodIndeksu {
    public static void main(String[] args) {
        String str = "Java is fun";
        int index = 5;

        char result = getCharacterAtIndex(str, index);

        System.out.println("Znak znajdujący się pod indeksem " + index + " to: " + result);
    }

    public static char getCharacterAtIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            throw new IndexOutOfBoundsException("Indeks poza zakresem łańcucha.");
        }
    }
}