package org.example;

//Napisz program, który policzy wszystkie liczby parzyste i nieparzyste z tablicy liczb całk.
//tab = [2, 3, 4, 5, 6]
//wynik = parzyste: 3, nieparzyste: 2


public class Task16BWybierzParzysteZTablicy {
    public static void main(String[] args) {
        int[] tab = {2, 3, 4, 5, 6};

        int[] counts = countEvenOddNumbers(tab);

        System.out.println("Parzyste: " + counts[0] + ", nieparzyste: " + counts[1]);
    }

    public static int[] countEvenOddNumbers(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }
}

