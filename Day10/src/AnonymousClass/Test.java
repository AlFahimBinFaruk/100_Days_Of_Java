package AnonymousClass;

public class Test {
    public static void main(String[] args){
        // normal class.
        Teacher myTeacher = new Teacher();
        myTeacher.printTeacher();

        // anonymous class
        Person myPerson=new Person(){
            @Override
            public void printPerson() {
                super.printPerson();// this will call the original printPerson()
                System.out.println("Printing Person from test file.");
            }

            @Override
            public void printPersonAge(){
                System.out.println("Printing Person age 66 from test file.");
            }
        };

        // overridden
        myPerson.printPerson();
        // overridden
        myPerson.printPersonAge();
        // not overridden
        myPerson.printPersonMobile();
    }
}
