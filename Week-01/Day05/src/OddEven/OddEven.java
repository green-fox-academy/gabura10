package OddEven;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x;
        System.out.println("Please provide me a number");
        x = sc1.nextInt();
        if (x%2 == 0){
            System.out.println("Even");}
        else{
            System.out.println("Odd");
        }




    }
}
