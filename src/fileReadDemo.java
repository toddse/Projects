import java.io.*;
import java.util.Scanner;
public class fileReadDemo {
    public static void main(String[] args) throws IOException{
        Scanner words = new Scanner(System.in);

        System.out.print("Enter the name of a file: ");
        String scroll = words.nextLine();

        Scanner alphabet = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String letter = alphabet.nextLine();

        File reader = new File(scroll);
        int counter = 0;

        Scanner inputFile = new Scanner(reader);
        String scroll2 = String.valueOf(inputFile);

        int i = 0;
        while (inputFile.hasNext())
        {

        }
        System.out.println("The character " + letter + "appears " + counter + " times in the file " + scroll2 + ".");
        inputFile.close();// close the file when done
    }
}
