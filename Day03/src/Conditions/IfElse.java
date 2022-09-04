package Conditions;

public class IfElse {

    public static void main(String[] args) {
        System.out.println("Running if else");

        int num1 = 33;
        int num2 = 44;

//      01.If else
        if (num1 < num2) {
            System.out.println("Num1 is less than num2");
        } else {
            System.out.println("Num1 is greater than num2");
        }

//      02.else if
        if (num1 == num2) {
            System.out.println("Num1 is equal than num2");
        } else if (num1 > 33333) {
            System.out.println("Num1 is greater than 33");
        } else {
            System.out.println("No condition matched");
        }
        
        
        /***********
         *Short hand if else
         *these are also known as conditional operators.
         ***********/
        String result=(num1 ==33)?"Num1 is 33": "Num1 is not 33";
        System.out.println("Result is "+result);
    }
}
