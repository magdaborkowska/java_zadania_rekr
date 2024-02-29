package org.example;

//Napisz program, który sprawdzi czy suma co trzeciego elementu w tablicy = 10
//tab1 = [1, 2, 3, 1, 2, 3, 1, 2, 4] true
//tab2 = [1, 2, 3, 1, 2, 3, 1, 2, 3] false


import java.util.ArrayList;
import java.util.List;

public class Task17SumaCoTrzeciegoWTablicy {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 1, 2, 3, 1, 2, 4};
        int[] tab2 = {1, 2, 3, 1, 2, 3, 1, 2, 3};

        boolean result1 = checkSumOfEveryThird(tab1, 10);
        boolean result2 = checkSumOfEveryThird(tab2, 10);

        System.out.println("tab1: " + result1);
        System.out.println("tab2: " + result2);
    }

    public static boolean checkSumOfEveryThird(int[] arr, int targetSum) {
        int sum = 0;
        for (int i = 2; i < arr.length; i += 3) {
            sum += arr[i];
        }
        return sum == targetSum;
    }
}