package org.example;

//Napisz program który usunie dany element z tablicy liczb całkowitych.
//        numbers: [1,2,3,5,6,5,6]
//        do usunięcia: 5
//        wynik: [1,2,3,4,6,6]

import java.util.Arrays;
import java.util.stream.Stream;

public class Task10UsunElementStreams {
    public static void main(String[] args){
        int[] numbers = {1,2,3,5,6,5,6};
        int numberToRemove = 5;

        int[] result = removeNumber(numbers, numberToRemove);

        System.out.println("Array after removing number " +numberToRemove+ ":" + Arrays.toString(result));
    }

    private static int[] removeNumber(int[] arr, int elementToRemove) {
        return Arrays.stream(arr)
                .filter(num -> num != elementToRemove)
                .toArray();
    }
}


