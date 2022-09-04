package day02;

public class DataTypes {

    public static void main(String[] args) {
        System.out.println("Running Data Types!");

        /*
        Data types are divided into two groups:
        01.Primitive data types - includes byte, short, int, long, float, double, boolean and char.
        02.Non-primitive data types - such as String, Arrays and Classes,Interface.
        
        **********Read this to  know more => https://www.w3schools.com/java/java_data_types.asp***********
         */
        
        /*      
        long--> 8 bytes, Stores whole numbers from 
        -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         */
        long myLong = -9223;
        System.out.println(myLong);

        /*
        double--> 8 bytes, Stores fractional numbers. Sufficient for storing 15 decimal digits
         */
        double myDouble = 33.33;
        System.out.println(myDouble);

        /*
        byte--> The byte data type can store whole numbers from -128 to 127. 
        This can be used instead of int or 
        other integer types to save memory 
        when you are certain that the value will be within -128 and 127:
         */
        byte myByte = 100;
        System.out.println(myByte);

        /*
        Scientific Numbers ->
        A floating point number can also be a scientific number with an "e" to indicate the power of 10:
         */
        float myFloatPower = 5e2f;
        double myDoublePower = 5e3;

//      which means 10^2 * 5
        System.out.println(myFloatPower);
        System.out.println(myDoublePower);
    }
}
