package Constructor.ConstructorOverloading;

public class Person {
    /**
     * Sometimes there is a need of initializing an object in different ways.
     * This can be done using constructor overloading.
     */
    //Read this :https://www.geeksforgeeks.org/constructor-overloading-java/

    // Default value of String is NULL
    // Default value of int is 0
    String name,country;
    int age;
    //default constructor
    Person(){
        System.out.println("This is a  default constructor");
    }

    Person(int a){
        this();//this() will call default constructor.
        age=a;
    }

    Person(String n,String c){
        name=n;
        country=c;
    }

//  print info
    public void printPerson(){
        System.out.println("My Person name => "+name
                + " ,country => "+country
                + " ,age => "+age);
    }
}
