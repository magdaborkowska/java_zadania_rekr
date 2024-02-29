package org.example;

//Napisz program java który znajdzie maksymalną i minimalną wartośc w tablicy liczb całkowitych.
//        tablica: [9,8,2]

import java.util.Arrays;

public class Task11MinMaxWartoscV1 {
    public static void main(String[] args) {
        int[] numbers = {9, 8, 2};

        findMinMax(numbers);
    }
    public static void findMinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Tablica jest pusta.");
            return;
        }

        Arrays.sort(arr);

        System.out.println("Minimalna wartość: " + arr[0]);
        System.out.println("Maksymalna wartość: " + arr[arr.length - 1]);
    }
}



