package WriteMultipleLines;

import java.io.*;

public class WriteMultipleLines {
    public static void WriteMultiLn(String path, String word, Integer number)  {
        File file = new File(path);
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 0; i < number; i++) {
            pw.println(word);
        }
        pw.close();
    }

    public static void main(String[] args) {
        WriteMultiLn( "Asztal", "wat", 5);
    }
}



