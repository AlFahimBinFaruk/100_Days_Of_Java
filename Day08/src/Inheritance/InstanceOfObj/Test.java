package Inheritance.InstanceOfObj;

public class Test {
    public static void main(String[] args){

        /**
         * instanceof is a keyword that is used for
         * checking if a reference variable (myEmployee,myPerson,myCar)
         * is containing a given type of object reference or not (Employee,Person,Car).
         * **/

        // Read : https://www.geeksforgeeks.org/instanceof-keyword-in-java/
        // Watch : https://www.youtube.com/watch?v=TXuPpxpKMDU

        Employee myEmployee = new Employee();
        Person myPerson=new Person();
        Car myCar=new Car();

        // check instance of Employee
        System.out.println("********** Printing instance of myEmployee **********");
        System.out.println(myEmployee instanceof  Employee);
        System.out.println(myEmployee instanceof  Person);
        System.out.println(myEmployee instanceof  Car);


        // check instance of Person
        System.out.println("********** Printing instance of myPerson **********");
        System.out.println(myPerson instanceof  Employee);
        System.out.println(myPerson instanceof  Person);
        System.out.println(myPerson instanceof  Car);

        // check instance of Car
        System.out.println("********** Printing instance of myCar **********");
        System.out.println(myCar instanceof  Employee);
        System.out.println(myCar instanceof  Person);
        System.out.println(myCar instanceof  Car);
    }
}
