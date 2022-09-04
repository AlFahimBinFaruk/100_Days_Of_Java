package Operators;

public class ArithmeticOpr {

    public static void main(String[] args) {
        System.out.println("Running Arithmetic operators");
        /*
        Arithmetic operators are used to perform common mathematical operations.
        Read this to know more => https://www.w3schools.com/java/java_operators.asp
         */

        int num1, num2, result;

        num1 = 33;
        num2 = 44;

//      01.Addition
        result = num1 + num2;
        System.out.println("Addition =>" + result);

//      02.Substraction
        result = num1 - num2;
        System.out.println("Substraction =>" + result);

//      03.Multiplication
        result = num1 * num2;
        System.out.println("Multiplication =>" + result);

//      04.Division
        result = num1 / num2;
        System.out.println("Division =>" + result);

//      05.Modulus = Returns the division remainder
        result = num1 % num2;
        System.out.println("Modulas =>" + result);

//      06.Increment = Increases the value of a variable by 1
        result = ++num1;//prefix
        result = num1++;//postfix
        System.out.println("Increment =>" + result);

//      07.Decrement = Decreases the value of a variable by 1
        result = --num2;
        result = num2--;
        System.out.println("Decrement =>" + result);

    }
}
