package BasicOOPExample.VersionTwo;


public class Test {
    public static void main(String[] args) {
        System.out.println("Running Version Two test.");
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

//      print person one
        myPerson.printPersonInfo();
//      print person two
        myPersonTwo.printPersonInfo();
    }
}
