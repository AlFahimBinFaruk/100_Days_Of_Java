package Encapsulation_Described;

public class Test {
    public static void main(String[] args){
        Example myExample=new Example();

        // get name.
        System.out.println("Name => "+myExample.getMyName());

        // set another name.
        myExample.setMyName("Suhan");

        //get new name.
        System.out.println("New Name => "+myExample.getMyName());
    }
}
