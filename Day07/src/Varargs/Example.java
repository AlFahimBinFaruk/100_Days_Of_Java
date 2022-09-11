package Varargs;

public class Example {

    /**
     * Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments.
     * Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.
     *
     * in simple term if we know the type of the argument
     * but not the number of the argument(how many times a single type
     * of argument is given) then we will use Varargs.
     * **/

    // Read this : https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
    // Watch : https://www.youtube.com/watch?v=hn5V5TmpDls

    static void printOutput(int... numbers){
        for (int i:numbers){
            System.out.println("Printing Number => "+i);
        }
    }
}
