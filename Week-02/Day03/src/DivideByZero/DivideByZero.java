package DivideByZero;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Please provide a number:");
        number = scanner.nextInt();
        try {
            System.out.println(10/number);
        }catch (Exception e){
            System.out.println("fail");
        }
    }
}
