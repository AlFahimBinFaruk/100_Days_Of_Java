package StaticVariable.ExampleTwo;

public class Test {
    public static void main(String[] args){
        System.out.println("Running Example two test.");

        //First count
        CountStudent myStudent=new CountStudent();
        myStudent.printOutput();
        //Second count
        CountStudent myStudentTwo=new CountStudent();
        myStudentTwo.printOutput();
        //Third count
        CountStudent myStudentThree=new CountStudent();
        myStudentThree.printOutput();
    }
}
