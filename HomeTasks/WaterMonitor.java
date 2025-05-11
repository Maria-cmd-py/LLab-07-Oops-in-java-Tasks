import java.util.Scanner;
public class WaterMonitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter total water consumption (liters): ");
        double liters = scanner.nextDouble();
        System.out.print("Enter number of days used: ");
        int days = scanner.nextInt();
        try {
            double average = liters / days;
            System.out.printf("%s's average daily water usage: %.2f liters%n", name, average);
        } catch (ArithmeticException e) {
            System.out.println("Number of days cannot be zero. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
