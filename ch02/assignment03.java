package ch02;
public class assignment03 {
    public static void main(String[] args) {
        System.out.println("Fibonacci Recursive version: " + rFibonacci(5));
        System.out.println("Fibonacci iterative version: " + iFibonacci(5));
        System.out.println();
    }

    public static int rFibonacci(int n) {
        if (n == 0)
            return 1;
        else
            return rFibonacci(n - 2) + rFibonacci(n - 1);
    }

    public static int iFibonacci(int n) {
        int retValue = 1;
        while (n != 0)
        {
            retValue = (retValue - 2) + (retValue - 1);
        }
        return (retValue);
    }
}