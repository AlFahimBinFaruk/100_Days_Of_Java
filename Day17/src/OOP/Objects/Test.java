package OOP.Objects;

public class Test {
    boolean programmer =true;

    // Driver method
    public static void main(String[] args){
        /**** In Java, an object(myObj) is created from a class(MyObj).
         * ***/

        // Accessing the object from different class.
        MyObj myObj=new MyObj();
        System.out.println("name => "+myObj.name);

        // Accessing the object of same class.
        // Everything outside of driver method is an object of Test class.
        Test myTest=new Test();
        System.out.println("Programmer => "+myTest.programmer);

    }
}
