package org.example;

//Napisz program, który Przesunie wszystkie zera na lewo a jedynki na prawo.
//tab1 = [0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1]

public class Task22ZeroNaLewo1NaPrawo {
    public static void main(String[] args) {
        int[] tab1 = {0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1};

        moveZerosAndOnes(tab1);

        System.out.print("Rezultat: [");
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i]);
            if (i < tab1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void moveZerosAndOnes(int[] arr) {
        int countZeros = 0;

        // Przesuwamy wszystkie zera na lewo
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[countZeros++] = 0;
            }
        }

        // Wypełniamy pozostałe miejsca jedynkami
        for (int i = countZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}