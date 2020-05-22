package MileToKmConverter;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Double x;
        double y;
        y= 1.609344d;
        System.out.println("please provide me a number");
        x = sc1.nextDouble();
        System.out.println(x*y +" km");
    }


}
