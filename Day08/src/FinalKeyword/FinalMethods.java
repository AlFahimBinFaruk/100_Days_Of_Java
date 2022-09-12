package FinalKeyword;

public class FinalMethods {
    /*****
     * 01. When a method is declared with final keyword, it is called a final method.
     *     A final method cannot be overridden.
     * ******/

    // Read : https://www.geeksforgeeks.org/final-keyword-in-java/, https://www.geeksforgeeks.org/using-final-with-inheritance-in-java/

    /****
     Code Example:

    class A
    {
        final void m1()
        {
            System.out.println("This is a final method.");
        }
    }

    class B extends A
    {
        void m1()
        {
            // Compile-error! We can not override
            System.out.println("Illegal!");
        }
    }

    ******/
}
