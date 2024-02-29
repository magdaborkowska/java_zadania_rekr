package org.example;

// Napisz program który wyświetla liczby od 1 do 100.
// Dla podzielnych przez 3 wyświetl "Fizz"
// Dla podzielnych przez 5 wyświetl "Buzz"
// Dla podzielnych przez 15 wyświetl "FizzBuzz"


public class Task33FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}