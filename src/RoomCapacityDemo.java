import java.util.Scanner;
public class RoomCapacityDemo {
    public static void main(String[] args) {

        int roomNumber, cap, enrolled, extraSeats = 0;

        Scanner space = new Scanner(System.in);

        System.out.print("Enter room number: ");
        roomNumber = space.nextInt();

        System.out.print("Enter capacity: ");
        cap = space.nextInt();

        System.out.print("Enter enrollment: ");
        enrolled = space.nextInt();

        if(roomNumber < 0) {
            System.out.print("Error! Room cannot not be a negative number.");
        }
        else if(cap < 0) {
            System.out.print("Error! Capacity cannot not be a negative number.");
        }
        else if(enrolled < 0) {
            System.out.print("Error! Enrollment cannot not be a negative number.");
        }
        else if(enrolled > cap) {
            System.out.print("Error! Enrollment cannot be greater than the capacity.");
        }
        else {
            RoomCapacity SafeSpace = new RoomCapacity(roomNumber, cap, enrolled);
            SafeSpace.display(roomNumber, cap, enrolled);
        }
    }
}
