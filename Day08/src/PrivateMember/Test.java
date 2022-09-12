package PrivateMember;

public class Test {
    public static void main(String[] args){
        // Watch :https://www.youtube.com/watch?v=tF0JZVWr3IQ
        // Read : https://www.geeksforgeeks.org/inheritance-in-java/
        /**
         * In simple term : we cannot inherit private member of class, so we have to use getter and setter method.
         * **/

        Employee myEmployee =new Employee();

        //set info
        myEmployee.setName("Al Fahim");
        myEmployee.setLanguage("Java");
        myEmployee.setSalary(333);
        myEmployee.setAddress("BD");
        myEmployee.setGender("male");
        myEmployee.setAge(3344);

        //display all info
        myEmployee.displayAllInfo();

    }
}
