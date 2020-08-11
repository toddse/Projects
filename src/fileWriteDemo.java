import java.io.*;
import java.util.Scanner;
public class fileWriteDemo {
    public static void main(String[] args) throws IOException {
        Scanner written = new Scanner(System.in);

        System.out.print("Enter the name of a file with extension: ");
        String scripture = written.nextLine();

        PrintWriter writer = new PrintWriter(scripture);
        writer.println("The PrintWriter class allows you to write data to a file using the print\n" +
                "and println methods, as you have been using to display data on the\n" +
                "screen. ");
        writer.println("Just as with the System.out object, the println method of the PrintWriter\n" +
                "class will place a newline character after the written data.\n");

        writer.println("The print method writes data without writing the newline character.");

        writer.println("You use the File class and the Scanner class to read data from a file.\n");

        writer.println("Once an instance of Scanner is created, data can be read using the same\n" +
                "methods that you have used to read keyboard input (nextLine, nextInt,\n" +
                "nextDouble, etc).\n");

        writer.println("The Scanner class’s hasNext() method will return true if another item\n" +
                "can be read from the file.\n");

        writer.println("File class’s exists() method determine whether the file exists.");

        writer.close();

        System.out.println("File is written.");
    }
}
