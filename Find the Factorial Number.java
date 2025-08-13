import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating factorial
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Printing the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}

