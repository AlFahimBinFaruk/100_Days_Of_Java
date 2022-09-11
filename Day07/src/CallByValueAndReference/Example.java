package CallByValueAndReference;

public class Example {

    // Read this : https://www.guru99.com/call-by-value-vs-call-by-reference.html
    /****
     * Key difference:
     *
     * 01. In Call by value method original value is not modified whereas,
     *     in Call by reference method, the original value is modified.
     *
     * 02. In Call by value, a copy of the variable is passed whereas in Call by reference,
     *     a variable itself is passed.
     *
     * 03. In Call by value, actual and formal arguments will be created in different memory
     *     locations whereas in Call by reference, actual and formal
     *     arguments will be created in the same memory location.
     *
     * 04. Call by value is the default method in programming languages like C++, PHP, Visual Basic NET, and C#
     *     whereas Call by reference is supported only Java language.
     *
     * 05. all by Value, variables are passed using a straightforward method
     *     whereas Call by Reference, pointers are required to store the address of variables.
     * ***/

    String name;
    void myCallByValueMethod(String name){
        this.name="Something Else";
    }

    void myCallByRefMethod(Example nameTwo){
        nameTwo.name= "Suhan";
    }


}
