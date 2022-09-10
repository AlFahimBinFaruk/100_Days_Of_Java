package StaticVariable.ExampleOne;

import StaticVariable.ExampleOne.StaticVariable;

public class Test {
    public static void main(String[] args) {
        System.out.println("Running static variables test.");

        //how to access instance variables
        StaticVariable myInsTest=new StaticVariable();
        System.out.println("My instance variable => "+myInsTest.myInStr);

        //how to access static variables
        System.out.println("My static variable => "+StaticVariable.myStaticStr);
    }
}
