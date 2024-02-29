package org.example;

//Napisz program, który znajdzie wszystkie liczby większe niż srednia wszystkich liczb.
//tab1 = [1, 4, 15, 7, 25, 3, 99]
//średnia = 22
//szukane liczby = 25 i 99

public class Task23LiczbyWiekszeNizSrednia {
    public static void main(String[] args) {
        int[] tab1 = {1, 4, 15, 7, 25, 3, 99};

        int[] greaterThanAverage = findNumbersGreaterThanAverage(tab1);

        System.out.print("Szukane liczby: ");
        for (int num : greaterThanAverage) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] findNumbersGreaterThanAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        int count = 0;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > average) {
                result[index++] = num;
            }
        }

        return result;
    }
}