import java.util.Scanner;
// Custom exception class
class InvalidAgeForCNICException extends Exception {
    public InvalidAgeForCNICException(String message) {
        super(message);
    }
}
public class CNICRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            if (age < 18 || age > 60) {
                throw new InvalidAgeForCNICException("Age must be between 18 and 60");
            }
            System.out.println("Your CNIC registration request has been accepted.");
        } catch (InvalidAgeForCNICException e) {
            System.out.println("You are not eligible to register for a CNIC. " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}