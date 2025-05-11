import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        double balance = 5000.0; // Initial balance
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        try {
            if (amount <= 0) {
                throw new ArithmeticException("Amount must be positive");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
