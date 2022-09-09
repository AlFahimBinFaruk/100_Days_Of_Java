package Wrapper;

public class WrapperClassJava {

    public static void main(String[] args) {
        System.out.println("Running wrapper class!!");

        /**
         * *****
         * 01.A Wrapper class is a class whose object wraps or contains
         * primitive data types, When we create an object to a wrapper class, it
         * contains a field and in this field, we can store primitive data
         * types, In other words, we can wrap a primitive value into a wrapper
         * class object.
         ******
         */
        
        /**
         * *****
         * 02.Wrapper class in java provides the mechanism to convert primitive
         * data type into object is called boxing/auto-boxing/ and object into
         * primitive data type is called unboxing.
         ******
         */
        
        
        /*******
         * 03.Primitive Type | Wrapper class
                boolean      | Boolean
                char         | Character
                byte         | Byte
                short        | Short
                int          | Integer
                long         | Long
                float        | Float
                double       | Double
         ********/
        
        
        
        /********* Examples. ************/
        
//      01.converting premitive type => wrapper class/object
         
        int myInt=3;
        Integer myWCInt=Integer.valueOf(myInt);//converting int into Integer.This is not used
        Integer myAutoBWCInt=myInt;//autoboxing,now the compiler will write Integer.valueOf(myInt)
        
        System.out.println("My Wrapped Integer => "+myWCInt);
        
        System.out.println("My Auto Boxed Integer => "+myAutoBWCInt);
        
        
        
//      02.converting Object => premitive data type

        Integer myIntTwo=new Integer(33);
        int myPInt=myIntTwo.intValue();//converting Integer into int.This is not used.
        int myAPInt=myIntTwo;//unboxing
        
        System.out.println("Premitive data => "+myPInt);
        
        System.out.println("Unboxed Premitive data => "+myAPInt);
        
    }
}
