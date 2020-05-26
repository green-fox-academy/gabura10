package UrlFixer;

import java.util.Arrays;

public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String goodurl = url.replace("bots", "odds");
        String finishedurl = goodurl.replace("https", "https:");
        System.out.println(finishedurl);

    }




}
