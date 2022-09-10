package BasicOOPExample.VersionTwo;

public class Person {
//  variables
    String name,gender,address;
    int phone;

//  method
//  void means nothing will be returned
//  this is a default method .The method is only accessible in the same package.
//  This is used when you don't specify a modifier(public,static etc)
    void printPersonInfo(){
        System.out.println("My Person name => "+name
                + " ,gender => "+gender
                + " ,address => "+address
                + " ,phone => "+phone);
    }
}
