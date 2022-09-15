package Hashset;

import java.util.HashSet;

public class Test {
    public static void main(String[] args){
        System.out.println("*********** Running hash set. ***********");

        // Syntax
        HashSet<String> nameList=new HashSet<String>();

        // add item
        nameList.add("Fahim");
        nameList.add("Suhana");
        nameList.add("Akib");
        nameList.add("Borhan");
        nameList.add("Borhan");// duplicate
        nameList.add("borhan");// not duplicate


        // check if the hashset is empty.
        System.out.println("Hash set empty => "+nameList.isEmpty());

        // print whole hash set.
        System.out.println("Hashset name list => "+nameList);

        // Check If an Item Exists
        System.out.println("Does namelist has fahim => "+nameList.contains("fahim"));//false,because it is case-sensitive.
        System.out.println("Does namelist has Fahim => "+nameList.contains("Fahim"));

        // remove an item
        nameList.remove("borhan");
        System.out.println("Hashset after removing borhan => "+nameList);

        // loop through hash set.
        System.out.println("*********** Starting loop ***********");
        for(String name:nameList){
            System.out.println("Printing name => "+name);
        }

        // clear whole hash set.
        nameList.clear();

        // print hash set size
        System.out.println("Hashset size => "+nameList.size());
    }
}
