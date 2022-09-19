package Regex_Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        // declare a pattern
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);

        // match the pattern
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();

        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
