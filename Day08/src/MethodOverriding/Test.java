package MethodOverriding;

public class Test {
    public static void main(String[] args){

        // Watch : https://www.youtube.com/watch?v=CXZ1SgyLMxU, https://www.youtube.com/watch?v=9nR-XD8hFnU
        // Read : https://www.geeksforgeeks.org/overriding-in-java/, https://www.geeksforgeeks.org/difference-between-method-overloading-and-method-overriding-in-java/

        /***
         * 01.Final,Static,Private methods cannot be overridden.
         * 02.The overriding method must have same return type (or subtype) and parameter number(otherwise it will be an overloaded method)
         * 03.Constructor cannot be overridden.
         * **/

        Employee myEmployee=new Employee();

        myEmployee.setEmployeeInfo("Java","BD",555);
        myEmployee.setPersonInfo("Fahim","Male",33);

        //This will call the print info of Employee class
        myEmployee.printInfo();

        //to call the print info of Person class
        Person myPerson =new Person();

        myPerson.setPersonInfo("Suhana","Female",55);
        myPerson.printInfo();
    }
}
