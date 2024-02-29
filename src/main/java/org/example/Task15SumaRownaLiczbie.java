package org.example;

//Napisz program, który znajdzie wszystkie pary liczb, których suma jest równa innej liczbie.
//tab = [1, 2, 3, 4, 5]
//suma = 5
//wynik = 1, 4 i 2, 3


import java.util.HashSet;
import java.util.Set;

public class Task15SumaRownaLiczbie {
    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5};
        int suma = 5;
        findPairs(tab, suma);
    }

    public static void findPairs(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = sum - num;
            if (set.contains(complement)) {
                System.out.println(num + ", " + complement);
            }
            set.add(num);
        }
    }
}


