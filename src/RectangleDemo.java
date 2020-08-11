import java.util.Scanner;  // Needed for the Scanner class
public class RectangleDemo {
    public static void main(String[] args) {

        double roomLength;  // To hold a room's length
        double roomWidth;   // To hold a room's width
        double totalArea;  // To hold the total area of the kitchen and the bedroom

        // Declare Rectangle variable to reference objects for the kitchen.
        Rectangle kitchen;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get and store the dimensions of the kitchen.
        System.out.print("What is the kitchen's length? ");
        roomLength = keyboard.nextDouble();
        System.out.print("What is the kitchen's width? ");
        roomWidth = keyboard.nextDouble();

        kitchen = new Rectangle(roomLength, roomWidth);

        // Print the area of the kitchen.
        System.out.println("The area of the kitchen is: " + kitchen.getArea());

        // Declare Rectangle variable to reference objects for the bedroom.
        Rectangle bedroom;

        // Get and store the dimensions of the bedroom.
        System.out.print("What is the bedroom's length? ");
        roomLength = keyboard.nextDouble();
        System.out.print("What is the bedroom's width? ");
        roomWidth = keyboard.nextDouble();

        bedroom = new Rectangle(roomLength, roomWidth);

        // Print the area of the bedroom.
        System.out.println("The area of the bedroom is: " + bedroom.getArea());

        //Adds and displays the area of the kitchen and the area of the bedroom.
        totalArea = kitchen.getArea() + bedroom.getArea();
        System.out.println("The total area of the house is: " + totalArea);
    }
}
