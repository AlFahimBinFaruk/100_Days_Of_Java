package JavaArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        System.out.println("Running Array List!!!");

        /**
         * ****
         * To know more:::::: Read this =>
         * https://www.w3schools.com/java/java_arraylist.asp , Watch this =>
         * https://www.youtube.com/watch?v=FZFdTY5FIHg ,Java array list methods
         * => https://www.programiz.com/java-programming/library/arraylist. ***
         */
//       ********array list of string************
        ArrayList<String> cars = new ArrayList<String>();
        System.out.println("Initial structure => " + cars);
//       ********adding items to array
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Bugatti");

        System.out.println(cars);

//      **** accessing the item
        System.out.println("Arraylist item => " + cars.get(1));
        
        
//        *** to see if it contains a specific item
        System.out.println("Contains BMW => "+ cars.contains("BMW"));
        
//        *** to see index of contains a specific item
        System.out.println("Index of BMW => "+ cars.indexOf("BMW"));

//      *** change an item
//      before
        System.out.println("Prev value => " + cars.get(2));
        cars.set(2, "Porche");
//      after
        System.out.println("After value => " + cars.get(2));

//      *** remove an item
        System.out.println("Prev array => " + cars);

//      remove
        cars.remove(2);

//      after removing
        System.out.println("New array => " + cars);

//      **** clear the whole array
        System.out.println("Before clearing => " + cars);

//      clear
        cars.clear();

        System.out.println("After clearing => " + cars);

//      *** to get array length
        System.out.println("Array size is => " + cars.size());

//      ******** see if arraylist is empty
        System.out.println("Is arraylist empty => "+cars.isEmpty());
    }
}
