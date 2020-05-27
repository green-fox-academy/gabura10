package CountLines.src.PrintEachLine;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            File file = new File("my-file.txt");
            Scanner scan = new Scanner(file);
            String filename = file.toString();
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Unable to find file: my-file.txt");
        }

    }
}