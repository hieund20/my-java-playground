package basic;

public class Operators {

    public static void main(String[] args) {
        int a = 10, b = 3;

        //Mathetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //Assigned operators
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("x after += 3: " + x);

        //Compared operators
        System.out.println("a > b? " + (a > b));
        System.out.println("a == b? " + (a == b));

        //Logical operators
        boolean results = (a > 5) && (b < 5);
        System.out.println("a > b && b < 5? " + results);

        //Ternary operators
        String message = (a % 2 == 0) ? "a is even" : "a is odd";
        System.out.println(message);
    }
}
