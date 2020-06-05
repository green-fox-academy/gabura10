package Sum;

import java.util.ArrayList;

public class Sum {
    public int sum(ArrayList<Integer> a) {
        int sumOfNumbers = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != null) {
                sumOfNumbers += a.get(i);
            } else {
                sumOfNumbers = 0;
            }
        }
        return sumOfNumbers;
    }
}



