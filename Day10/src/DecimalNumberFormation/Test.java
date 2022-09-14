package DecimalNumberFormation;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args){
        // method 01
        double myDOne=33.44532;
        System.out.printf("Method one with : printf() => %.2f",myDOne);
        System.out.println();

        // method 02;
        double myDTwo=44.55524;
        String myDTwoStrVOne=String.format("$%,.2f",myDTwo);
        String myDTwoStrVTwo=String.format("%.2f",myDTwo);
        System.out.println("Method two with : String.format() : version one "+myDTwoStrVOne);
        System.out.println("Method two with : String.format() : version two "+myDTwoStrVTwo);


        // method 03
        DecimalFormat myDecimalFormat=new DecimalFormat("0.000");
        double myDThree=56.64323;
        System.out.println("Method Three with : DecimalFormat class => "+myDecimalFormat.format(myDThree));

    }
}
