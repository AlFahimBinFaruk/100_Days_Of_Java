package Iterators_Java;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args){
        // Make a collection
        ArrayList<String> myCars = new ArrayList<String>();
        myCars.add("Volvo");
        myCars.add("BMW");
        myCars.add("Ford");
        myCars.add("Mazda");

        Iterator<String> myCarsIterator=myCars.iterator();

        /****** printing values *****/
        //System.out.println("Printing car => "+myCarsIterator.next()); //volvo
        //System.out.println("Printing car => "+myCarsIterator.next());//bmw
        //System.out.println("Printing car => "+myCarsIterator.next()); //ford
        //System.out.println("Printing car => "+myCarsIterator.next());//mazda

        //System.out.println("Printing car => "+myCarsIterator.next()); //NoSuchElementException

        /************* looping in iterator *************/
//        while(myCarsIterator.hasNext()) {
//            System.out.println("Printing car : "+myCarsIterator.next());
//        }



        /*********** Removing items from iterator *************/

        /*
        * Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the
        * collection is changing size at the same time that the code is trying to loop.
        * */

        // myCarsIterator.remove(); // this will give IllegalStateException
        while(myCarsIterator.hasNext()) {
            String i = myCarsIterator.next();
            if(i =="BMW") {
                myCarsIterator.remove();
            }
        }
        System.out.println(myCars);
    }
}
