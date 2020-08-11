import java.util.Scanner;  // Needed for the Scanner class
import java.lang.String;

public class StudentDemo {

    public static void main(String[] args) {

        int studentId = 0;
        String studentName = "";
        double numOfCredits = 0.0;
        double numOfPoints = 0.0;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the student's Id number? ");
        studentId = keyboard.nextInt();

        System.out.println("What is the student's name? ");
        studentName = keyboard.next();

        System.out.println("How many credits did the student earn? ");
        numOfCredits = keyboard.nextDouble();

        System.out.println("How many points did the student earn? ");
        numOfPoints = keyboard.nextDouble();

        Student Adam = new Student(studentId, studentName, numOfCredits, numOfPoints);

        Adam.displayFields(studentId, studentName, numOfCredits, numOfPoints);

        System.out.println("The Student's GPA is: " + Adam.getGPA());
    }
}
