import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking student data as input
        System.out.print("Enter student name: - student data.java:8");
        String studentName = scanner.nextLine();

        System.out.print("Enter student ID: - student data.java:11");
        int studentID = scanner.nextInt();

        System.out.print("Enter student age: - student data.java:14");
        int studentAge = scanner.nextInt();

        System.out.print("Enter student fee: - student data.java:17");
        float studentFee = scanner.nextFloat();

        System.out.print("Enter student grade: - student data.java:20");
        char studentGrade = scanner.next().charAt(0);

        // Printing student details
        System.out.println("\nStudent Details: - student data.java:24");
        System.out.println("Student name: - student data.java:25" + studentName);
        System.out.println("Student ID: - student data.java:26" + studentID);
        System.out.println("Student age: - student data.java:27" + studentAge);
        System.out.println("Student fee: - student data.java:28" + studentFee);
        System.out.println("Student grade: - student data.java:29" + studentGrade);

        scanner.close();
    }
}