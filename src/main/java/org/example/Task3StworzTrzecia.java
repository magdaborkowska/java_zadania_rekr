package org.example;

// Mając dwie tablice stwórz trzecią, która będzie się składała z pierwszego el. pierwszej i ostatniego drugiej.
// tabl1 = {1,2,3,4}
// tabl2 = {5,6,7,8}
// tabl3 = {1,8}

import java.util.Arrays;

public class Task3StworzTrzecia {
    public static void main(String[] args) {

        int[] tabl1 = {1,2,3,4};
        int[] tabl2 = {5,6,7,8};
        int[] tabl3 = new int[2];

        tabl3[0] = tabl1[0];
        tabl3[tabl3.length-1] = tabl2[tabl2.length-1];

//        for(int num : tabl3) {
//            System.out.println(num);
//        }
        System.out.println("tabl3 = " + Arrays.toString(tabl3));
    }
}