import java.util.Scanner;
public class MarksViewer {
    public static void main(String[] args) {
        String[] subjects = {"Math", "Science", "English", "History", "Geography"};
        int[] marks = {85, 90, 78, 88, 92};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter subject index (0-4): ");
        int index = scanner.nextInt();
        try {
            System.out.println(name + "'s marks in " + subjects[index] + ": " + marks[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid subject index! Please enter between 0-4.");
        }
    }
}

