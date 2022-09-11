package Varargs;

public class Test {
    public static void main(String[] args){
        //First call
        System.out.println("************** First Call ****************");
        Example.printOutput(33,33,44,4,5,55);

        //Second call
        System.out.println("************** Second Call ****************");
        Example.printOutput(4,5,55);

        //Third call
        System.out.println("************** Third Call ****************");
        Example.printOutput(33,33,44,4,5,55,89,47457,77,97);
    }
}
