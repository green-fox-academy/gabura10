package CountFrom;
import java.util.Scanner;
public class CountFrom {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x;
        System.out.println("Please provide me a number!");
        x = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int y;
        System.out.println("Please provide me another number!");
        y = sc2.nextInt();
        if (y<x == true){
            System.out.println("The second number should be bigger");}
        else{
            for (int i = x; i<y+1; ++i){
                System.out.println(i);
            }
        }
        }

    }
