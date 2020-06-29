import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {
        String name = "Alexander";
        Stream<Character> result = name.chars().mapToObj(c -> (char) c);
                result.filter(c -> c.isUpperCase(c)).forEach(System.out::println);
    }
}
