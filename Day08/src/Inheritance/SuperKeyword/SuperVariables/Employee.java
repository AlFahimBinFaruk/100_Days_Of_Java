package Inheritance.SuperKeyword.SuperVariables;

public class Employee extends Person {
    String name="Employee Suhan";

    public void printName(){
        System.out.println("Employee name => "+name);

        //usage of super.
        System.out.println("Person name => "+super.name);
    }
}
