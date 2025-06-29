package string_collection;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a string: ");
        String input = scanner.nextLine();

        //Count the words
        String[] words = input.trim().split("\\s+");
        System.out.println("The counter of words in a string: " + words.length);

        //Print uppercase
        System.out.println("Uppercase the string: " + input.toUpperCase());

        //Reverse string
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        //Palindrome checking
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        String reversedNormalized = new StringBuilder(normalized).reverse().toString();
        if (normalized.equals(reversedNormalized)) {
            System.out.println("This is a palindrome string");
        } else {
            System.out.println("This is not a palindrome string");
        }

        scanner.close();
    }
}
