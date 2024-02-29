package org.example;

//Napisz program java który znajdzie takie same wartości w tablicy liczb całkowitych.
//        tablica1 : ['a','b','c','d','e']
//        tablica2 : ['b','e']

public class Task13TeSameElementy {
    public static void main(String[] args) {

        char[] array1 = {'a', 'b', 'c', 'd', 'e'};
        char[] array2 = {'b', 'e'};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println("Te same elementy: " + array1[i]);
                }
            }
        }

    }
}


