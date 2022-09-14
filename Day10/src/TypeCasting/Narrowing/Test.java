package TypeCasting.Narrowing;

public class Test {
    public static void main(String[] args){
        /***
         * Narrowing Casting (manually) - converting a larger type to a smaller size type
         * Example : double -> float -> long -> int -> char -> short -> byte
         * **/

        double a=33.33;
        int b=(int) a;
        long c=(long) a;

        // printing.
        System.out.println("Printing double a => "+a);
        System.out.println("Printing int b => "+b);
        System.out.println("Printing long c => "+c);



    }
}
