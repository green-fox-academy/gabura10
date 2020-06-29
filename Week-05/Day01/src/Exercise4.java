import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        OptionalDouble result = numbers.stream()
                .filter(l-> l%2 !=0)
                .mapToInt(l-> l)
                .average();
        if (result.isPresent()){
            System.out.println(result.getAsDouble());
        }else{
            System.out.println("There are no numbers in the list");
        }
    }
}
