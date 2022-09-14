package TypeCasting.Widening;

public class Test {
    public static void main(String[] args){
        /*****
         * Widening Casting (automatically) - converting a smaller type to a larger type size
         * Example : byte -> short -> char -> int -> long -> float -> double
         */

        int a=33;
        long b=a;
        float c=a;
        double d=a;

        // printing
        System.out.println("Printing int a => "+a);
        System.out.println("Printing long b => "+b);
        System.out.println("Printing float c => "+c);
        System.out.println("Printing double d => "+d);

    }
}
