package StaticMethods;

public class Example {

    //Read this:https://www.geeksforgeeks.org/static-methods-vs-instance-methods-java/
    //Watch :https://www.youtube.com/watch?v=CTvteDE4tIs, https://www.youtube.com/watch?v=Q7q_SXBKwOk

    /***** Static method restrictions ******
     * 01. Static methods can't use not-static member(Other non-static method,variable,constructor)
     * 02. "this" and "super" keyword can't be used here.
     * *****/

    //Normal method
    void normalMethod(){
        System.out.println("This is a normal method.");
    }

    //static method
    static void staticMethod(){
        System.out.println("This is a static method.");
    }
}
