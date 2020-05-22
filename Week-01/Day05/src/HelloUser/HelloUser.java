package HelloUser;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String username;
        System.out.println("How can I call you");
        username = sc1.nextLine();
        System.out.println("Hello " + username );


    }
}
