package exception;

import java.util.Scanner;

public class TryCatchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Type integer a: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("Type integer b: ");
            int b = Integer.parseInt(scanner.nextLine());

            int result = a / b;
            System.out.println("Result a / b = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error when divide zero");
        } catch (NumberFormatException e) {
            System.out.println("Error format: You should type integer number");
        } catch (Exception e) {
            System.out.println("Unexpected error " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs");
            scanner.close();
        }
    }
}
