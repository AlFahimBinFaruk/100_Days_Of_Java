package Operators;

public class LogicalOpr {

    public static void main(String[] args) {
        System.out.println("Running Logical operators");

        int num1, num2;
        boolean result;
        num1 = 33;
        num2 = 44;

//      01.&&
        result = num1 > 0 && num2 > 100;// in case of logical operator in java you 
        // always have to send a basic requirement.
        System.out.println("Exmapls of && =" + result);

//      02.||
        result = num1 > 0 || num2 > 100;
        System.out.println("Exmapls of && =" + result);

//      03.!
        result = !(num1 > 0 && num2 > 0);
        System.out.println("Exmapls of && =" + result);
    }
}
