package Inheritance.BasicExample;

public class Test {
    public static void main(String[] args){

        // Watch : https://www.youtube.com/watch?v=XZO7OMMFMl8
        // Read : https://www.geeksforgeeks.org/inheritance-in-java/

        Employee myEmployee=new Employee();

        myEmployee.setPersonInfo("Fahim","Male",33);

        myEmployee.setEmployeeInfo("Java","BD",3333);

        myEmployee.printEmployeeInfo();
        myEmployee.printPersonInfo();
    }
}
