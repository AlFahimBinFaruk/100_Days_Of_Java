package LinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        // this is a linked list of string data type.
        LinkedList<String> countryList=new LinkedList<String>();

        // 01.add() items to linked list.
        countryList.add("BD");
        countryList.add("India");
        countryList.add("USA");

        // 02.add() with index
        // this will replace the item at index 2.
        countryList.add(2,"Canada");

        // 03.addFirst()
        countryList.addFirst("Ireland");

        // 03.addLast()
        countryList.addLast("Germany");

        // 04.remove() by value
        countryList.remove("USA");

        // 05.remove() by index
        countryList.remove(1);

        // 06.removeFirst()
        countryList.removeFirst();

        // 07.removeLast()
        countryList.removeLast();

        // 08.getFirst()
        System.out.println("First value => "+countryList.getFirst());

        // 09.getLast()
        System.out.println("Last value => "+countryList.getLast());

        // print linked list with forEach loop
        for (String country: countryList){
            System.out.println("Printing country => "+country);
        }

        // clearing the whole linked list
        countryList.clear();

        // printing linked list size.
        System.out.println("Total Country => "+countryList.size());


    }
}
