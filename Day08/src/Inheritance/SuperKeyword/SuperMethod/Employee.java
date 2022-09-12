package Inheritance.SuperKeyword.SuperMethod;

public class Employee extends Person {
    @Override
    public void printInfo(){
        //printInfo();//it will be a recursion.
        super.printInfo();//it will call the printInfo() of Person class.
        System.out.println("This is print info of Employee....");
    }
}
