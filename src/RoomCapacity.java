public class RoomCapacity {
    private int room;
    private int capacity;
    private int enrollment;

    public RoomCapacity(int rNum, int cap, int en){
        room = rNum;
        capacity = cap;
        enrollment = en;
    }

    public int getRoom()
    {
        return room;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getEnrollment()
    {
        return enrollment;
    }

    public int emptySeats()
    {
        return capacity - enrollment;

    }

    public String filledNotFilled()
    {
        if (emptySeats() == 0)
        {
            return "Filled";
        }
        else
            return "Not Filled";
    }

    public void display(int rNum, int cap, int en)
    {
        System.out.println("Room\tCapacity\tEnrollment\tEmpty Seats\tFilled/Not Filled");
        System.out.print(rNum + "\t\t");
        System.out.print(cap + "\t\t\t");
        System.out.print(en + "\t\t\t");
        System.out.print(emptySeats() + "\t\t\t\t");
        System.out.print(filledNotFilled());
    }
}
