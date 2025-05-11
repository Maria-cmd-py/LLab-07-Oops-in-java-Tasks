import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter purchase amount (Rs.): ");
        double amount = scanner.nextDouble();
        try {
            if (amount <= 0 || amount > 100000) {
                throw new IllegalArgumentException();
            }
            double discount = amount * 0.10;
            double finalPrice = amount - discount;
            System.out.printf("%s, your final price after 10%% discount: Rs. %.2f%n",
                    name, finalPrice);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount entered. Please enter a value between Rs. 1 and Rs. 100,000.");
        } finally {
            scanner.close();
        }
    }
}
