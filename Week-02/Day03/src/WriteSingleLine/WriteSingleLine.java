package WriteSingleLine;

import java.io.*;

public class WriteSingleLine {
    public static void main(String[] args) {
        try {
            File file = new File("my-file.txt");
            FileWriter filewriter = new FileWriter(file);
            PrintWriter printwriter = new PrintWriter(filewriter);
            printwriter.println("Gabura Alexander");
            printwriter.close();
        }catch (IOException e){
            System.out.println("Unable to write file: my-file.txt");
        }

        }
    }
