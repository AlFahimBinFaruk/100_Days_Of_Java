package Conversion;

public class StringToPrimitive {
    public static void main(String[] args){
        System.out.println("Running String to primitive conversion!!");

        /*****
         * Watch this => https://www.youtube.com/watch?v=0ZAsvFSKwqU
         *******/

//       01.String to int
         String myIntStr="33";

         int myInt=Integer.parseInt(myIntStr);
         System.out.println("My Converted int with parse => "+myInt);

         int myIntTwo=Integer.valueOf(myIntStr);
         System.out.println("My Converted int with valueOf => "+myIntTwo);

//       02.String to boolean
         String myBoolStr="false";

         boolean myBool=Boolean.parseBoolean(myBoolStr);
         System.out.println("My Converted boolean with parse => "+myBool);

         boolean myBoolTwo=Boolean.valueOf(myBoolStr);
         System.out.println("My Converted boolean with valueOf => "+myBoolTwo);


    }
}
