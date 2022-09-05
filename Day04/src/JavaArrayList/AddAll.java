package JavaArrayList;

import java.util.ArrayList;

public class AddAll {

    public static void main(String[] args) {
        System.out.println("Running Add all in arraylist!!");

        // create an arraylist
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        System.out.println("Languages: " + languages);

        // create another arraylist
        ArrayList<String> programmingLang = new ArrayList<>();

        //add all will take another array list.
        //type have to match
        // add all elements from languages to programmingLang
        programmingLang.addAll(languages);
//      its own item
        programmingLang.add("JavaScript");

        System.out.println("Programming Languages: " + programmingLang);
    }
}
