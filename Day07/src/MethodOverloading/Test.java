package MethodOverloading;

public class Test {
    public static void main(String[] args){
        Example myExample=new Example();

        myExample.add();

        myExample.add(3,3);

        myExample.add(3.3,44.44);

        myExample.add("Fahim",66.66,5);
    }
}
