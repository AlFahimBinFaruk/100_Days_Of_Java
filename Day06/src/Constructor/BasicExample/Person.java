package Constructor.BasicExample;

public class Person {

    //Read this :https://www.w3schools.com/java/java_constructors.asp
    /****
     * 01..  A constructor in Java is a special method that is used to initialize objects.
        The constructor is called when an object of a class is created.
        It can be used to set initial values for object attributes
     * 02. You can create as many constructor you want but the parameters have to be different.
     * 03. A constructor without parameters is called Default constructor.
    * *********/

    String name,address,gender;
    int phone;

//  defining a constructor with params
//  constructor name must match with file name
    public Person(String n, String a, String g, int p){
       name=n;
       address=a;
       gender=g;
       phone=p;
    };

    public void printPerson(){
        System.out.println("My Person name => "+name
                + " ,gender => "+gender
                + " ,address => "+address
                + " ,phone => "+phone);
    }
}
