package ch02;

public class TesterClass {
    public static void main(String[] args) {
        System.out.println(binarySearch(32, 8, 10));
    }

    static int[] values = {5, 7, 10, 13, 13, 20, 21, 25, 30, 32, 40, 45, 50, 52, 57, 60};
    public static boolean binarySearch (int target, int first, int last){
        int midpoint = (first + last) / 2;
        if (first > last)
            return false;
        else
            if (target == values[midpoint])
                return true;
            else
            if (target > values[midpoint])
                return binarySearch(target, midpoint + 1, last);
            else
                return binarySearch(target, first, midpoint - 1);
    }
}