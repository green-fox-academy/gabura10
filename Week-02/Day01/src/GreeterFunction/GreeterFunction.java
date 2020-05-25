package GreeterFunction;

public class GreeterFunction {
    static String greet (String x) {
        return ("Greetings dear," + x);
    }
    public static void main(String[] args) {
        String al = "Green Fox";
        System.out.println(greet(al));
    }

}
