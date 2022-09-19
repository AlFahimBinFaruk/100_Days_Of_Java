package HexOctBin_Conversion;

import java.util.Scanner;

class Example
{
    Scanner scan;

    String type;
    String num;
    void getVal()
    {
        System.out.println("HexaDecimal,Octal and Binary to Decimal");
        scan = new Scanner(System.in);

        // get the number type (hex,octal or binary)
        System.out.println("Enter the number type (hexadecimal,octal or binary) : ");
        type =scan.nextLine();

        System.out.println("Enter the number : ");
        num = scan.nextLine();
    }
    void convert()
    {
        // convert  hexadecimal to decimal
        if(type.toString().equals("hexadecimal")){
            int binaryOne=Integer.parseInt(num,16);
            System.out.println("Hexadecimal to decimal value => "+binaryOne);
        }

        // convert octal to decimal
        else if(type.toString().equals("octal")){
            int binaryTwo=Integer.parseInt(num,8);
            System.out.println("Octal to decimal value => "+binaryTwo);
        }

        // convert binary to decimal
        else if(type.toString().equals("binary")){
            int binaryThree=Integer.parseInt(num,2);
            System.out.println("Binary to decimal value => "+binaryThree);
        }
        else{
            System.out.println("no match found for type  : "+ type);
            System.out.println("num is : "+ num);
        }
    }

    public static void main(String args[])
    {
        Example obj = new Example();
        obj.getVal();
        obj.convert();
    }
}