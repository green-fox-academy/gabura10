package WriteMultipleLines;
import java.io.*;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String path, word;
        int number;
        System.out.println("Please provide me a path:");
        path = scan.nextLine();
        System.out.println("Please provide me a word:");
        word = scan.nextLine();
        System.out.println("Please provide me a number:");
        number = scan.nextInt();
        File file = new File(path);
        try{
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i <= number ; i++) {
                pw.println(word);}
            pw.close();
        }catch (IOException e){
            System.out.println("Error");
        }

        }
        }



