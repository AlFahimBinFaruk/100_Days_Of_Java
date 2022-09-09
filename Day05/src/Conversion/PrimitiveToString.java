package Conversion;

public class PrimitiveToString {
    public static void main(String[] args){

        System.out.println("Running Premetive to string conversion!");

        /*****
         * Watch this => https://www.youtube.com/watch?v=0ZAsvFSKwqU
         *******/

//      01.Int to string
        int myInt=33;
        String myIntStr=Integer.toString(myInt);
        System.out.println("After converting myInt => "+myIntStr.getClass().getSimpleName());

//      02.Boolean to string
        boolean myBool=true;
        String myBoolStr=Boolean.toString(myBool);
        System.out.println("After converting myBool => "+myBoolStr.getClass().getSimpleName());
    }
}
