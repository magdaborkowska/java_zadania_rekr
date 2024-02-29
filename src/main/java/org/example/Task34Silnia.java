package org.example;

// Napisz program który policzy silnię dla n


public class Task34Silnia {
    public static void main(String[] args) {
        int n = 5; // Przykładowa liczba dla której obliczamy silnię

        long factorial = calculateFactorial(n);

        System.out.println("Silnia z " + n + " wynosi: " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia jest zdefiniowana tylko dla liczb nieujemnych.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}