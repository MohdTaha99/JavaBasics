import java.util.Scanner;

public class SumUpToNumber {
    // This method will sum up all numbers from 1 to the number given by the user
    public static void sumNumbers(int number) {
        int sum = 0; // Start with a sum of 0

        // Add each number from 1 to the user's number
        for (int i = 1; i <= number; i++) {
            sum += i; // Add the current number to the sum
        }

        // Print out the final sum
        System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Call the method to sum numbers and print the result
        sumNumbers(userInput);
    }
}

