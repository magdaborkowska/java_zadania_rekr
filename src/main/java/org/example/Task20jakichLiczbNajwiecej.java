package org.example;

//Napisz program, który znajdzie policzy jakich liczb jest najwięcej i ile razy występują.
//tab1 = [1, 1, 3, 2, 2, 7, 4 , 5, 7, 5, 7, 20]
//wynik = najwięcej jest 7, występuje 3 razy


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task20jakichLiczbNajwiecej {
    public static void main(String[] args) {
        int[] tab1 = {1, 1, 3, 2, 2, 2, 7, 4, 5, 7, 5, 7, 20};

        Map<Integer, Integer> frequencyMap = countFrequencies(tab1);
        List<Integer> mostFrequentNumbers = findMostFrequentNumbers(frequencyMap);

        System.out.print("Najwięcej jest ");
        for (int i = 0; i < mostFrequentNumbers.size(); i++) {
            int number = mostFrequentNumbers.get(i);
            System.out.print(number);
            if (i < mostFrequentNumbers.size() - 1) {
                System.out.print(" oraz ");
            }
        }
        System.out.println(", występują " + frequencyMap.get(mostFrequentNumbers.get(0)) + " razy.");
    }

    public static Map<Integer, Integer> countFrequencies(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }

    public static List<Integer> findMostFrequentNumbers(Map<Integer, Integer> frequencyMap) {
        List<Integer> mostFrequentNumbers = new ArrayList<>();
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mostFrequentNumbers.clear();
                mostFrequentNumbers.add(number);
                maxFrequency = frequency;
            } else if (frequency == maxFrequency) {
                mostFrequentNumbers.add(number);
            }
        }

        return mostFrequentNumbers;
    }
}