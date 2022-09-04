package Loops;

public class DoWhileLoop {

    public static void main(String[] args) {
        System.out.println("Running Do While Loop.");

        int i = 0;
        
//      Syntax of do while loop
        do {
            System.out.println("Value of i is =>" + i);
            i++;
        } while (i > 0 && i <= 5);
    }
}
