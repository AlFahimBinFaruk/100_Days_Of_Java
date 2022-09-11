package Recursion;

//This recursion example is done by using factorial -> n! = n*(n-1)
public class Test {
    /***
     * Watch : https://www.youtube.com/watch?v=voGyK8L4ANM
     * Very important
     * ***/

    // Watch : https://www.youtube.com/watch?v=5yP5Tr218kc
    // Read : https://www.w3schools.com/java/java_recursion.asp

    /****
     * In simple terms a recursion is a function that call itself until a condition is met.
     * ****/

    //Print factorial method
    static int printFactorial(int arg){
        if(arg == 1){
            return 1;
        }else{
           return arg * printFactorial(arg-1);
        }
    }

    //main method
    public static void main(String[] args){
        int factorialSix = printFactorial(6);
        System.out.println("My Factorial of 6 is => "+factorialSix);

        int factorialFour = printFactorial(4);
        System.out.println("My Factorial of 4 is => "+factorialFour);
    }
}
