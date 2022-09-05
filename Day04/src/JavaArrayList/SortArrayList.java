package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        System.out.println("Running Sort array list!!");
        /**
         * *****
         * To know more::: Read this =>
         * https://www.w3schools.com/java/java_arraylist.asp , watch this =>
         * https://www.youtube.com/watch?v=FZFdTY5FIHg. *****
         */

        /**
         * Collections class include the sort() method for sorting lists
         * alphabetically or numerically
         */
//      Sorting String
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("************* Sorting String assending *********************");
//      sort assending
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println("Printing car => " + i);
        }

        System.out.println("************* Sorting String desending *********************");

//      sort assending
        Collections.sort(cars, Collections.reverseOrder());
        for (String i : cars) {
            System.out.println("Printing car => " + i);
        }

//      Sorting Integer
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        System.out.println("************** Sorting Integer assending *************");

//      sorting assending
        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println("Assending order => " + i);
        }

        System.out.println("************** Sorting Integer desending *************");

//      sorting desending
        Collections.sort(myNumbers, Collections.reverseOrder());  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println("Decending order => " + i);
        }
    }

}
