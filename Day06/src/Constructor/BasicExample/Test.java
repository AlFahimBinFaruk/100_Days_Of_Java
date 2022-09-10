package Constructor.BasicExample;

public class Test {
    public static void main(String[] args){
        System.out.println("Running constructor test.");

        Person myPerson=new Person("Fahim","BD","Male",333);
        myPerson.printPerson();
    }
}
