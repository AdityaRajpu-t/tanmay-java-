import java.util.Scanner;

public class marks{
    String name;
    int marks;
    static class MarksOutOfRangeException extends Exception {
        public MarksOutOfRangeException(String message) {
            super(message);
        }
    }

    public static void validateMarks(int marks) throws MarksOutOfRangeException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfRangeException("Marks must be between 0 and 100.");
        }
        System.out.println("Marks are valid: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        try {
            validateMarks(marks);
            System.out.println("Student Name: " + name + ", Marks: " + marks);
        } catch (MarksOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
