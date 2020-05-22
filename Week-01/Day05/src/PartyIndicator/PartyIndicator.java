package PartyIndicator;
import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int x;
        System.out.println("How many girl come to the party?");
        x = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int y;
        System.out.println("How many boys come to the party?");

        y = sc2.nextInt();
        if ( x > 19 && y>19 && x == y){
            System.out.println("The party is excellent!");}
        else{
            if (x != y && x>19 && y>19){
                System.out.println("Quite cool party!");}
            else{
                if (x+y<20){
                    System.out.println("Average party...");}
                else{
                    if (x==0){
                        System.out.println("Sausage party");}
                    }
                }
            }

        }
    }

