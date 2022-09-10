package Methods;

public class ReturnTut {

    //this will return int
    static int returnIntMethod(int i){
        return  i;
    }

    //this will return String
    static String returnStringMethod(String name){
        return  "My name is "+name;
    }

    public static  void main(String[] args){
        System.out.println("Running Return Tut.");

        int myInt=returnIntMethod(33);
        System.out.println("My Int => "+myInt);

        String myName=returnStringMethod("fahim");
        System.out.println(myName);
    }
}
