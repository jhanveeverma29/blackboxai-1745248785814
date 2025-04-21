import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IntermediateExceptionHandlingDemo {

    public static void main(String[] args) {
        // Example 1: Multiple catch blocks
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        }

        // Example 2: Try-with-resources for automatic resource management
        try (BufferedReader br = new BufferedReader(new FileReader("nonexistentfile.txt"))) {
            String line = br.readLine();
            System.out.println("Read line: " + line);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        // Example 3: Throwing custom exception
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }

        System.out.println("Program continues after intermediate exception handling.");
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
