import java.util.*;
import java.util.stream.Collectors;


public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream()
                .filter(l -> l % 2 == 0)
                .forEach(System.out::println);
    }
}