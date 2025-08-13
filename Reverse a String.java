import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reversing the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Printing the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
