package ch02;
import ch02.src.support.LLNode;
import java.util.Scanner;

public class assignment02 {
    /**
 * @param args the command line arguments
 */
 public static void main(String[] args)
 {
    int number;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer number to add in the list or press -1 to stop: ");
    number = scan.nextInt();
    LLNode<Integer> numbers = null;
    while (number!=-1)
    {
        LLNode<Integer>newNode=new LLNode<Integer>(number);
        newNode.setLink(numbers);
        numbers=newNode;
        System.out.print("Enter a integer number to add in the list or press -1 to stop: ");
        number = scan.nextInt();
    }
    int sum = 0;
    int counter = 0;
    LLNode<Integer> currNode = numbers;
    while (currNode != null)
    {
        System.out.println(currNode.getInfo());
        sum = sum + currNode.getInfo();
        counter++;
        currNode = currNode.getLink();
    }
    System.out.println("The sum of the numbers on the Linked List is: " + sum);
    System.out.println("There are " + counter + " elements on the Linked List.");
    scan.close();
 }
}
