package Scope;

public class BlockScope {

    String name="fahim";

    /**
     * 01. Block scope values can only be accessed inside of block scope.
     * 02. Block scope code. will execute first time the code runs.
    * */

    // block scope.
    {
        String address="BD";
        System.out.println("Address => "+address);
    }


    public static void main(String[] args){
        BlockScope myScope=new BlockScope();

        if(3==3){
           String IP="33.44";
           System.out.println("IP => "+IP);
        }
        //System.out.println("IP => "+IP);// this will give error

        System.out.println("Name => "+myScope.name);

        //System.out.println("Name => "+myScope.address);//this will give error.

    }

}
