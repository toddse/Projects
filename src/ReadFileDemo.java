import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

public class ReadFileDemo 
{
  public static void main(String[] args) throws IOException
  {
    Scanner words = new Scanner(System.in);
    //System.out.println("Enter the name of a file: ");
    //String fileName = words.nextLine(); //filename

    Scanner charInput = new Scanner(System.in);
    System.out.println("Enter a character: ");
    CharSequence character = charInput.nextLine();
    
    File file = new File("test.txt");
    Scanner inputFile = new Scanner(file);

    int counter = 0;
    while(inputFile.hasNext())
    {
      String str = inputFile.nextLine();
      
      if(str.contains(character))
      {
        counter++;
      }
    }

   
    inputFile.close(); System.out.println("The Character appears " + counter + " times in the file.");
  }
}