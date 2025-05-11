import java.util.Scanner;
public class SubjectPicker {
    public static void main(String[] args) {
        String[] subjects = {"Java", "Python", "Web", "DBMS", "AI", "Networks"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject index (0-5): ");
        int index = scanner.nextInt();
        try {
            System.out.println("Selected subject: " + subjects[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid subject index. Please select a number between 0 and 5.");
        } finally {
            scanner.close();
        }
    }
}
