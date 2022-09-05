package JavaStrings;

public class NumberAndStrings {

    public static void main(String[] args) {
        System.out.println("Running numbers and strings");

//      1.string + string
        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)

        System.out.println("String + String => " + z);
        
//      1.string + integer
        String a = "10";
        int b = 20;
        String c = a + b;  // z will be 1020 (a String)

        System.out.println("String + Integer => " + c);
        
//      ********** type of c 
        System.out.println("Type of c => "+c.getClass().getSimpleName());
    }
}
