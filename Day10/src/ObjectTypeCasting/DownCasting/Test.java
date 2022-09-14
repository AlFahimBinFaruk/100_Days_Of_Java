package ObjectTypeCasting.DownCasting;

public class Test {
    public static void main(String[] args){
        /**
         * Down casting gives a compile error.
         * The compile error can be removed by adding a cast but would anyway break at the runtime.
         * **/

        /**  Down casting is not possible in Java. **/

        // This will give run time error.
        Teacher myTeacher = (Teacher) new Person();
        myTeacher.printTeacher();
        myTeacher.printPerson();
    }
}
