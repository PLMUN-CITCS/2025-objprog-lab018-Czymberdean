import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Get integer input from the user
        int number = getIntegerInput();

        // Check if the number is even or odd
        String result = checkEvenOrOdd(number);

        // Display the result
        System.out.println(result);
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Input validation loop
        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume invalid input
            }
        }

        scanner.close(); // Close the scanner
        return number;
    }

    // Method to check if a number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
