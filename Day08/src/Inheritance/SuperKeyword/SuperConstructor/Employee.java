package Inheritance.SuperKeyword.SuperConstructor;

public class Employee extends Person {
    Employee(){
        //if you call a constructor inside a constructor you have to call the constructor of parent class at first.
        super();//this means call the constructor of Parent class(Person)
        System.out.println("This is the constructor of Employee Class.");
    }

    Employee(int age){
        //calling super constructor with parameter.
        super("Fahim");//this means call the constructor of Parent class(Person)
        System.out.println("Employee age => "+age);
    }
}
