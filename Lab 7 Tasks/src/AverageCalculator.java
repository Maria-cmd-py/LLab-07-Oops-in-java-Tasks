import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter total marks obtained: ");
        int totalMarks = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        try {
            double average = totalMarks / numSubjects;
            System.out.println(name + "'s average marks: " + average);
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of subjects cannot be zero!");
        }
    }
}
