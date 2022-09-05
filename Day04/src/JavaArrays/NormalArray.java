package JavaArrays;

public class NormalArray {

    public static void main(String[] args) {
        System.out.println("Running Normal Array!");
        /*******
         * Array methods => https://www.geeksforgeeks.org/array-class-in-java/.
         ********/
        /*
        1.You can store only one type of data in java array
         */
//      array of strings
        String[] cars = {"BMW", "Mercedes", "Porche"};
        
//      accessing the elements of an array
        System.out.println("First Car is => " + cars[0]);

//      array of integers
        int[] roll = {1, 33, 44};

//      accessing the elements of an array
        System.out.println("Second roll is => " + roll[1]);

        /**
         * **
         * Changing the value of specific element of roll array
         ****
         */
        roll[1] = 44444;
//      printing updated value
        System.out.println("Updated Second roll is => " + roll[1]);

//      finding out array lenght
        System.out.println("Cars array lenght is => " + cars.length);
    }
}
