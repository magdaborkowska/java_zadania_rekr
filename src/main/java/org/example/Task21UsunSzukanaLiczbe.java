package org.example;

//Napisz program, który usunie szukaną liczbę oraz wszystkie większe od niej liczby po prawej stronie od niej. Liczby nie mogą się powtarzać
//tab1 = [3, 4, 10, 5, 6, 7, 8 , 9, 1, 2]
//szukana liczba = 5
//rezultat = [3, 4, 10, 1, 2]


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task21UsunSzukanaLiczbe {
    public static void main(String[] args) {
        int[] tab1 = {3, 4, 10, 5, 6, 7, 8, 9, 1, 2};
        int searchNumber = 5;

        int[] result = removeAndFilterNumbers(tab1, searchNumber);

        System.out.print("Rezultat: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] removeAndFilterNumbers(int[] arr, int searchNumber) {
        List<Integer> resultList = new ArrayList<>();

        boolean removed = false;
        for (int num : arr) {
            if (num <= searchNumber) {
                resultList.add(num);
                if (num == searchNumber) {
                    removed = true;
                }
            } else if (!removed) {
                removed = true;
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}