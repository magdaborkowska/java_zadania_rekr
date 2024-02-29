package org.example;

//Co zostanie wyświetlone w konsoli?


import java.util.ArrayList;
import java.util.List;

public class Task27CoZostnieWyswietlone {
    public static void main(String[] args) {
        Integer number = 128;
        List<Integer> numbers = new ArrayList<>();

        while (number >= 32) {
            number -= number / 2;
            numbers.add(number);
        }
        System.out.println(numbers);
    }
}