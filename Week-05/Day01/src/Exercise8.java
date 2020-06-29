import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        List<String> chars = new ArrayList<>();
        chars.add("a");
        chars.add("p");
        chars.add("a");
        chars.add("a");
        chars.add("a");
        chars.add("a");
        chars.add("a");
        StringBuilder sb = new StringBuilder();
        chars.stream()
                .forEach(c -> sb.append(c));
        System.out.println(sb);
    }

}
