package ListIntroduction2;

import java.util.ArrayList;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberrries");
        ListA.add("Durian");
        ListA.add("Lychee");
        System.out.println(ListA);
        ArrayList<String> ListB = ListA;
        System.out.println(ListA.contains("Durian"));
        ListB.remove("Durian");
        ListA.add("Kiwifruit");
        System.out.println(ListA.size()+ " and "+ ListB.size());
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));
        ListB.add("Passion Fruit");
        ListB.add("Pomelo");
        System.out.println(ListA.get(2));
    }
}
