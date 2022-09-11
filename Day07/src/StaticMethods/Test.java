package StaticMethods;

public class Test {
    public static  void main(String[] args){
        System.out.println("Running Static Method.");

        Example myNormalEx=new Example();
        //calling normal method
        myNormalEx.normalMethod();

        //calling static method
        Example.staticMethod();
    }
}
