package Constructor.ConstructorOverloading;

public class Test {
    public static void main(String[] args){
        System.out.println("Running Constructor overloading.");

        Person myDefaultPerson=new Person();

        Person personAge=new Person(33);
        personAge.printPerson();

        Person personInfo=new Person("Fahim","BD");
        personInfo.printPerson();
    }
}
