import java.io.*;
import java.util.Scanner;
public class FileReader {
    public static void main(String[] args) throws IOException {

        Scanner File = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String fileName = File.nextLine();

        File reader = new File(fileName);
        Scanner nice = new Scanner(reader);
        while (nice.hasNext()) {
            String str = nice.nextLine();
            System.out.println(str);
        }
        nice.close();
    }
}
