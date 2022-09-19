package Decimal_Conversion;

import java.util.Scanner;

class Example
{
    Scanner scan;
    int num;
    void getVal()
    {
        System.out.println("Decimal to HexaDecimal,Octal and Binary");
        scan = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        num = Integer.parseInt(scan.nextLine());
    }
    void convert()
    {
        // convert to hexadecimal
        String hexa = Integer.toHexString(num);
        System.out.println("HexaDecimal Value is : " + hexa);

        // convert to octal
        String octal = Integer.toOctalString(num);
        System.out.println("Octal Value is : " + octal);

        // convert to binary
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary);
    }

    public static void main(String args[])
    {
        Example obj = new Example();
        obj.getVal();
        obj.convert();
    }
}
