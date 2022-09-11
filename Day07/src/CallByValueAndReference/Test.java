package CallByValueAndReference;

public class Test {
    public static void main(String[] args){
        Example myObj=new Example();

        //call by value
        String x="Fahim";
        System.out.println("Call by value -> Before  => "+x);

        myObj.myCallByValueMethod(x);
        System.out.println("Call by value -> After => "+x);

        //call by reference
        myObj.name="Zayn";
        System.out.println("Call by ref -> Before => "+myObj.name);

        myObj.myCallByRefMethod(myObj);
        System.out.println("Call by ref -> After => "+myObj.name);

    }
}
