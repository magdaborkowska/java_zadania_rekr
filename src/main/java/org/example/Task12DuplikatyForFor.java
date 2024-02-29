package org.example;

//Napisz program java który znajdzie takie same wartości w tablicy liczb całkowitych.
//        tablica : [1,2,3,2,3,4,5,6,6]

public class Task12DuplikatyForFor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 3, 4, 5, 6, 6};

        findDuplicates(numbers);
    }
    public static void findDuplicates(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }
}



