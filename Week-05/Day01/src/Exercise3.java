import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream()
                .filter(l-> l*l>20)
                .forEach(System.out :: println);
    }
}
