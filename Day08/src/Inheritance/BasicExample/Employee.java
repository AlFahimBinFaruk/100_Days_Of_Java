package Inheritance.BasicExample;

//this is an example of single inheritance.
public class Employee extends Person {
    // The features of Person class are now available in Employee class.

    /**
     * Super Class: The class whose features are inherited is known as a superclass
     * or a base class or a parent class (Person)
     *
     * Sub Class: The class that inherits the other class is known
     * as a subclass or a derived class, extended class, or child class (Employee)
     * **/
    String language,address;
    int salary;

    public void setEmployeeInfo(String language,String address,int salary){
        this.language=language;
        this.address=address;
        this.salary=salary;
    }

    public void printEmployeeInfo(){
        System.out.println("Employee Language =>"+language+", address => "+address+", salary => "+salary);
    }
}
