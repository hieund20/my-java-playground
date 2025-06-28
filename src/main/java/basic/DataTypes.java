package basic;

public class DataTypes {

    public static void main(String[] args) {

        //Original data types
        int age = 8;
        double salary = 1500.67;
        char type = 'A';
        boolean isPassed = true;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Type: " + type);
        System.out.println("Pass or Drop: " + (isPassed ? "Pass" : "Drop"));

        //Parse types
        float rate = (float) salary / age;
        System.out.println("Rate: " + rate);

        //Exercise
        double r = 5;
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
