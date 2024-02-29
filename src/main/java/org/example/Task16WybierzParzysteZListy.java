package org.example;

//Napisz program, który wybierze jedynie liczby parzyste z listy
//my_list = ['2', '8', '4', '6', '10', '13', '15', '12', '14']


import java.util.ArrayList;
import java.util.List;

public class Task16WybierzParzysteZListy {
    public static void main(String[] args) {
        List<String> myList;
        myList = new ArrayList<>(List.of("2", "8", "4", "6", "10", "13", "15", "12", "14"));

        List<String> evenNumbers = selectEvenNumbers(myList);
        System.out.println("Liczby parzyste z listy:");

        for (String num : evenNumbers) {
            System.out.println(num);
        }
    }
    public static List<String> selectEvenNumbers(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String num : list) {
            int n = Integer.parseInt(num);
            if (n % 2 == 0) {
                result.add(num);
            }
        }

        return result;
    }
}

