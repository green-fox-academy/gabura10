package Anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public boolean anagram(String a, String b) {
        if (a.isEmpty() == true && b.isEmpty() == true){
            return true;
        }
        if (a.length() != b.length()){
            return false;
                }
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] listOfA = a.toCharArray();
        char[] listOfB = b.toCharArray();
        Arrays.sort(listOfA);
        Arrays.sort(listOfB);
        String sortedA = new String(listOfA);
        String sortedB = new String(listOfB);
        return sortedA.equals(sortedB);
    }

    public static void main(String[] args) {
        Anagram ana = new Anagram();

    }
}
