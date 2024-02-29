package org.example;

//Napisz program, który sprawdzi czy tablica zwiera oba konkretne elementy, np 65 i 77.
//tab1 = [1, 2, 65, 5, 77, 90, 0] true
//tab2 = [1, 2, 65, 1, 2, 3, 1] false


public class Task18SprawdzenieCzyTablicaZawElementy {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 65, 5, 77, 90, 0};
        int[] tab2 = {1, 2, 65, 1, 2, 3, 1};

        boolean result1 = checkElements(tab1, 65, 77);
        boolean result2 = checkElements(tab2, 65, 77);

        System.out.println("tab1: " + result1);
        System.out.println("tab2: " + result2);
    }

    public static boolean checkElements(int[] arr, int element1, int element2) {
        boolean foundElement1 = false;
        boolean foundElement2 = false;

        for (int num : arr) {
            if (num == element1) {
                foundElement1 = true;
            } else if (num == element2) {
                foundElement2 = true;
            }
        }

        return foundElement1 && foundElement2;
    }
}