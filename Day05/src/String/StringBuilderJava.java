package String;

public class StringBuilderJava {

    public static void main(String[] args) {
        System.out.println("Running string builder!!");
        
        /***
         *Read this =>https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/.
         ****/
        
        StringBuilder strOne = new StringBuilder("Al");

        System.out.println("First print => " + strOne);

        strOne.append(" Fahim");

        System.out.println("2nd print => " + strOne);

        strOne.reverse();

        System.out.println("3rd print => " + strOne);
    }

}
