package BasicOOPExample.VersionOne;

public class Test {
    public static void main(String[] args){
        System.out.println("Running example test.");
        /****
         * We didn't have to import Person class it will be available automatically.
         * *****/
//      person one
        Person myPerson=new Person();

        myPerson.name="Fahim";
        myPerson.gender="Male";
        myPerson.address="BD";
        myPerson.phone=33333;

//      person two
        Person myPersonTwo=new Person();

        myPersonTwo.name="Suhan";
        myPersonTwo.gender="Male";
        myPersonTwo.address="Berlin";
        myPersonTwo.phone=6656632;

        System.out.println("My Person name => "+myPerson.name
                + " ,gender => "+myPerson.gender
                + " ,address => "+myPerson.address
                + " ,phone => "+myPerson.phone);

        System.out.println("Person Two name => "+myPersonTwo.name
                + " ,gender => "+myPersonTwo.gender
                + " ,address => "+myPersonTwo.address
                + " ,phone => "+myPersonTwo.phone);

    }
}
