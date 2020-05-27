package CountLines;

import java.io.*;

public class CountLines {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Alex\\gabura10\\Week-02\\Day03\\src\\CountLines\\mytxt.txt");
            try{
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                int lineNumberCount = 0;
                while(lnr.readLine()!=null){
                    lineNumberCount++;
                }
                System.out.println(lineNumberCount);
            } catch (FileNotFoundException e) {
                System.out.println("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    }


