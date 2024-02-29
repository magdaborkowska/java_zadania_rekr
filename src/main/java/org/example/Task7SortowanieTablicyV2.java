package org.example;

// Napisz program który posortuje tablice liczb całkowitych.
// numbers = {4,6,2,3,7,8,1,9,0}
// wynik = {0,1,2,3,4,6,7,8,9}


public class Task7SortowanieTablicyV2 {
    public static void main(String[] args) {

        int[] numbers = {4,6,2,3,7,8,1,9,0};
        int min;

        for (int i=0; i<numbers.length; i++) {
            min = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] <min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        for (int number :numbers) {
            System.out.print(number + " ");
        }
    }
}