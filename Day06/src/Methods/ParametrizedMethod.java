package Methods;

public class ParametrizedMethod {
    //Declaring the method
    static void printGivenInfo(String name,String country,int phone){
        System.out.println("Username =>"+name+", Country => "+country+", Phone => "+phone);
    }

    public static void  main(String[] args){
        System.out.println("Running parametrized info..");
        //calling the method.
        printGivenInfo("Fahim","BD",5555);
        printGivenInfo("Suhan","Germany",7777);
    }
}
