import java.util.Scanner;
// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AdmissionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        try {
            if (age <= 0) {
                throw new InvalidAgeException("Age must be positive");
            }
            if (age > 100) {
                throw new InvalidAgeException("Age cannot exceed 100");
            }
            System.out.println("Admission successful for " + name);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}