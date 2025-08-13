import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student data as input
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        int studentID = scanner.nextInt();

        System.out.print("Enter Student Age: ");
        int studentAge = scanner.nextInt();

        System.out.print("Enter Student Fee: ");
        float studentFee = scanner.nextFloat();

        System.out.print("Enter Student Grade: ");
        char studentGrade = scanner.next().charAt(0);

        // Printing student details
        System.out.println("\nStudent Details:");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Fee: " + studentFee);
        System.out.println("Student Grade: " + studentGrade);

        scanner.close();
    }
}
