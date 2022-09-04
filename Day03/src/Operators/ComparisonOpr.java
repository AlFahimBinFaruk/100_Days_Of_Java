package Operators;

public class ComparisonOpr {

    public static void main(String[] args) {
        System.out.println("Running Comparison operators");

        int num1 = 33;
        int num2 = 44;
        boolean result;
        
        /*****
         * Comparison operators always returns true or false depending on condition.
         * comparison operators are also called relational operators.
         *******/

//      01.==
        result = num1 == num2;
        System.out.println("Example of == =>" + result);

//      02.!=
        result = num1 != num2;
        System.out.println("Example of != =>" + result);

//      03.>?
        result = num1 > num2;
        System.out.println("Example of > =>" + result);

//      04.<
        result = num1 < num2;
        System.out.println("Example of < =>" + result);

//      05.>=
        result = num1 >= num2;
        System.out.println("Example of >= =>" + result);

//      06.<=
        result = num1 <= num2;
        System.out.println("Example of <= =>" + result);
    }
}
