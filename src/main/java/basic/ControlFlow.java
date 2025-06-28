package basic;

import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //IF - ELSE
        System.out.println("Type integer number: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        //SWITCH
        System.out.println("Type score (A/B/C/D/F): ");
        char grade = scanner.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Semi good");
                break;
            case 'D':
                System.out.println("Normal");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid");
        }

        //FOR LOOP - Multiplication table
        System.out.println("Multiplication table 5: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // WHILE LOOP - Type number until correctly
        int input;
        do {
            System.out.println("Type number from 1 to 10: ");
            input = scanner.nextInt();
        } while (input < 1 || input > 10);
        System.out.println("You had typed: " + input);
    }
}
