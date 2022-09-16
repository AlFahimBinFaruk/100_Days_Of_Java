package StaticBlock;

public class Test {
        static String name;
        static int age;

        // static block
        static {
            name="fahim";
            age =33;
            System.out.println("Inside static block => "+name+", "+age);
        }

        public void printOutside(){
            System.out.println("Outside static block => "+name+", "+age);
        }



        // Driver method.
        public static void main(String[] args){
                Test myTest=new Test();
                myTest.printOutside();
        }
}
