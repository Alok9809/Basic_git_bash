
import java.util.Scanner;

public class SubtractionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Performing subtraction
        double result = num1 - num2;

        // Printing result
        System.out.println("Result of subtraction: " + result);

        scanner.close();
    }
}
