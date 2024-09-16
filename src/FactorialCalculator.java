import java.util.Scanner;

public class FactorialCalculator {
    // This method calculates the factorial of a given number
    public static int calculateFactorial(int number) {
        if (number < 1) {
            System.out.println("Please enter a number greater than zero.");
            return -1; // Invalid input
        }

        int factorial = 1; // Start factorial with 1

        // Multiply all numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            factorial *= i; // factorial = factorial * i
        }

        return factorial; // Return the result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a whole number greater than zero: ");
        int userInput = scanner.nextInt();

        // Calculate factorial and print the result
        int result = calculateFactorial(userInput);

        if (result != -1) {
            System.out.println("The factorial of " + userInput + " is: " + result);
        }
    }
}

