package StaticBlock;

public class Example {
    //Read this : https://www.geeksforgeeks.org/static-blocks-in-java/
    //static block executes automatically when the class is loaded in memory

    //because non-static member cannot be used inside static block.
    //By member , I mean method,variables,constructor,block
    static String name,address;

    //static block
    static {
        System.out.println("Running Static Block");
        name="Fahim";
        address="BD";
    }

    static  void printInfo(){
        System.out.println("Info => "+name+", "+address);
    }
}
