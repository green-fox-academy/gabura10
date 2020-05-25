package Factorial;

public class Factorial {
    static int factorio(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorio(n - 1));
        }


    }

    public static void main(String[] args) {
        int i,fact = 1;
        int number = 5;
        fact= factorio(number);
        System.out.println(fact);
    }

}