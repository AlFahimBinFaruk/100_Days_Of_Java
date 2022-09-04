package Operators;

public class UnaryOpr {

    public static void main(String[] args) {
        System.out.println("Running Unary operators");
        /**
         * For more read
         * this=>https://www.javascripttutorial.net/javascript-unary-operators/
         *
         */
        int num1, result;

//      01.+ unary plus => turn negative number into posivite (it will multiply the number with +)
        num1 = 33;
        result = +num1;
        System.out.println("Unary Plus =>" + result);

//      02.+ unary minus => turn positive number into negative (it will multiply the number with -)
        num1 = -33;
        result = -num1;
        System.out.println("Unary Minus =>" + result);

//      03.++x Increment Operator (Prefix) 
//      it will increase the number immidiately.
        num1 = 33;
        result = ++num1;
        System.out.println("Incremetn prefix =>" + result);

//      04.x++ Increment Operator (Postfix)
//      it will not increase the number immidiately.
        num1 = 33;
        result = num1++;//this will get 33
        System.out.println("Increment postfix =>" + result);

        result = num1;//this will get 34
        System.out.println("Increment postfix =>" + result);

//      05.--x Decrement Operator (Prefix) 
//      it will decrease the number immidiately.
        num1 = 33;
        result = --num1;
        System.out.println("Decrement prefix =>" + result);

//      06.x-- Decrement Operator (Postfix)
//      it will not decrease the number immidiately.
        num1 = 33;
        result = num1--;//this will get 33
        System.out.println("Decrement postfix =>" + result);

        result = num1;//this will get 34
        System.out.println("Decrement postfix =>" + result);
    }
}
