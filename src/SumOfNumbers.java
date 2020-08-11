import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        n = keyboard.nextInt();

        for (int number = 1; number <= n; ++number)
        {
            sum = number + sum;
        }
        System.out.println("The sum of 1 to " + n + " is "+ sum + ".");
    }
}
