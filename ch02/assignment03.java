package ch02;
import java.util.*;
public class assignment03 {
    public static void main(String[] args) {
        System.out.println("Fibonacci Recursive version: " + fibonacci(2));
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n == 1)
            return 1;
        else
            return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
