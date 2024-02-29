package org.example;

//Napisz program (java) który znajdzie drugi największy element w tablicy zawierającej liczby całkowite
//tab = [1, 3, 5, 2, 7, 20]
//wynik 7

public class Task14DrugiNajwiekszyElement {
    public static void main(String[] args) {

        int[] tab = {1, 3, 5, 2, 7, 20};
        int secondLargest = findSecondLargest(tab);
        System.out.println("Second largest number is " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}


