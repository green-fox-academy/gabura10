package DrawTriangle;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int i;
        System.out.println("Please provide a number");
        i = sc1.nextInt();
        for (int a=0;a<i;a++){
            for (int b=0; b<a+1; b++) {
                System.out.print("*");}
            System.out.println();

        }

    }
}