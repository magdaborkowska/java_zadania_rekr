package org.example;

// Napisz program który odwróci string
// String: "Java is fun"
// Odwrócony String: "nuf si avaJ"


public class Task30OdwrocString {
    public static void main(String[] args) {
        String str = "Java is fun";

        String reversedStr = reverseString(str);

        System.out.println("Odwrócony String: " + reversedStr);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}