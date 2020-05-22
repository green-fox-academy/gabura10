package OneTwoALot;

import  java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x;
        System.out.println("Please provide me a number");
        x = sc1.nextInt();
        if (x == 0){
            System.out.println("Not Enough");}
        else{
            if (x == 1){
                System.out.println("One");}
            else{
                if (x == 2) {
                    System.out.println("Two");}
                else{
                    System.out.println("A lot");}
            }
        }
    }
}
