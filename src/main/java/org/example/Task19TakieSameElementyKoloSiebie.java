package org.example;

//Napisz program, który znajdzie takie same elementy położone koło siebie w tablicy.
//tab1 = [a, b, c, d, d, c, b , a]
//wynik = dd


public class Task19TakieSameElementyKoloSiebie {
    public static void main(String[] args) {
        char[] tab1 = {'a', 'b', 'c', 'd', 'd', 'c', 'b', 'a'};

        findAdjacentDuplicates(tab1);
    }

    public static void findAdjacentDuplicates(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + " " + arr[i + 1]);
            }
        }
    }
}