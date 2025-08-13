public class Main {
    import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Asking user to enter second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculating sum
        int sum = num1 + num2;

        // Printing the result
        System.out.println("Sum of the two numbers is: " + sum);

        scanner.close();
    }
}

}
