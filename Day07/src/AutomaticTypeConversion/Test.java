package AutomaticTypeConversion;

public class Test {

    /******
     * Type Conversion Table:
     *
     * 01. double -> none
     * 02. float -> double
     * 03. long -> float,double
     * 04. int -> long ,float,double
     * 05. char -> int,long ,float,double
     * 06. short -> int,long ,float,double
     * 07. byte -> short,int,long,float,double
     * 08. boolean -> none
     * *****/

    static void myPrinter(double a,int b){
        System.out.println("Double a is => "+a);
        System.out.println("Integer b is => "+b);
    }

    public static void main(String[] args){
        //myPrinter need double and int, but we have provided int and char to the type will be
        //automatically converted according to above table.
        myPrinter(33,'3');
    }
}
