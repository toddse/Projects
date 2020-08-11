import java.util.*;
public class ArrayOfNumbers {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.println("Enter 10 numbers to puy into the array: ");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = nums.nextInt();
        }

        int odds = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                odds = odds + numbers[i];
            }
        }
        System.out.println("");
        System.out.println("The sum of all the odd numbers in this array is: " + odds);

        int evens = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                evens = evens + numbers[i];
            }
        }
        System.out.println("");
        System.out.println("The sum of all the even numbers in this array is: " + evens);

        int [] reverseNumbers = new int[10];

        for (int i = 9, j = 0; i >= 0; i--, j++)
        {
            reverseNumbers[j] = numbers[i];
        }
        System.out.println("The reverse order of this array is: ");
        for (int val: reverseNumbers)
        {
            System.out.println(val);
        }
    }
}
