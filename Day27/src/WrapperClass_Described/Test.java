package WrapperClass_Described;

public class Test {
    public static void main(String[] args) {

        /**
         * 01.Both int,double,char and Integer,Double,Character means the same type here.
         * 02.But because wrapper class are objects there are some methods available there like :
         * intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().
         * */

        Integer myInt = 5;
        int myIntTwo=33;
        Double myDouble = 5.99;
        double myDoubleTwo = 6.99;
        Character myChar = 'A';
        char myCharTwo='B';

        String myString = myInt.toString();
        System.out.println("My String length => "+myString.length());

        System.out.println(myInt);
        System.out.println(myIntTwo);
        System.out.println(myDouble);
        System.out.println(myDoubleTwo);
        System.out.println(myChar);
        System.out.println(myCharTwo);

        System.out.println("********* Wrapper class methods ****************");
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}
