package exception;

public class CustomException {

    public static void checkAge(int age) throws AgeInvalidException{
        if (age < 0 || age > 120) {
            throw new AgeInvalidException("Invalid age: " + age);
        } else {
            System.out.println("Valid age " + age);
        }
    }

    public static void main(String[] args) {
        int[] agesToTest = {25, -7, 30};

        for (int age : agesToTest) {
            try {
                checkAge(age);
            } catch (AgeInvalidException e) {
                System.out.println("Error age: " + e.getMessage());
            }
        }
    }
}
