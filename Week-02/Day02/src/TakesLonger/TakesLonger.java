package TakesLonger;

import java.util.Arrays;

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String add = " always takes longer than";
        System.out.println(quote.indexOf("It"));
        System.out.println(quote.length());
        int index = quote.indexOf("you");
        StringBuilder newquote = new StringBuilder(quote.substring(0,20));
        newquote.append(add);
        newquote.append(quote,20,82);
        System.out.println(newquote);
        newquote.insert(index,quote);
        quote = newquote.toString();
        System.out.println(quote);



            }

        }







