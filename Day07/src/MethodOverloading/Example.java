package MethodOverloading;

public class Example {

    //Read :  https://www.geeksforgeeks.org/method-overloading-in-java/
    //Watch : https://www.youtube.com/watch?v=DwaUODamu2g

    //Any kind of method(static,public,etc) can be overloaded
    void add(){
        System.out.println("This is default add.");
    }

    void add(int a,int b){
        System.out.println("First param =>"+a+", Second param=> "+b);
    }

    void add(double a,double b){
        System.out.println("First param =>"+a+", Second param => "+b);
    }

    void add(String a,double b,int c){
        System.out.println("First param =>"+a+", Second param => "+b+", Third param => "+c);
    }
}
