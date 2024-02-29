package org.example;

// Napisz program który usunie dany element z tablicy liczb całkowitych.
// numbers = {1,2,3,5,6}
// liczba do usunięcia: 5
// wynik = {1,2,3,6}

import java.util.Arrays;

//public class Task9UsunElementStreams {
//    public static void main(String[] args) {
//
//        int[] numbers = {1, 2, 3, 5, 6};
//        int numberToRemove = 5;
//
//        int[] result = removeElementWithStream(numbers, numberToRemove);
//
//        System.out.println("Wynik po usunięciu elementu " + numberToRemove + ": " + Arrays.toString(result));
//    }
//    public static int[] removeElementWithStream(int[] arr, int elementToRemove) {
//        return Arrays.stream(arr)
//                .filter(num -> num != elementToRemove)
//                .toArray();
//    }
//}

public class Task9UsunElementStreams{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6};
        int numberToRemove = 5;

        int[] newNumbers = removeNumber(numbers, numberToRemove);

        System.out.println("Array after removing number " + numberToRemove + ":" + Arrays.toString(newNumbers));

    }
    public static int[] removeNumber(int[] array, int elementToRemove){
        return Arrays.stream(array)
                .filter(num -> num != elementToRemove)
                .toArray();
    }
}


