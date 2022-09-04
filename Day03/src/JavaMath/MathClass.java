package JavaMath;


public class MathClass {

    public static void main(String[] args) {
        System.out.println("Running Math class.");
        
        /******
         *Read this to know more Math methods =>https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html.
         ******/

        int num1 = 33;
        int num2 = -44;

//      01.Math.max(x,y) takes two number and find  out
//      which number is the bigger from the two.
        System.out.println("Math max is =" + Math.max(num1, num2));

//      02.Math.min(x,y) takes two number and find  out
//      which number is the smallest one from the two.
        System.out.println("Math min is =" + Math.min(num1, num2));

//      04.Math.sqrt(x) takes one number and find  out
//      the square root of that number.
        System.out.println("Math sqrt is =" + Math.sqrt(num1));

//      05.Math.abs(x) takes one number and always give positive output
        System.out.println("Math abs is =" + Math.abs(num2));

//      06.Math.pow() generates an random number everthime it is called.
        System.out.println("Power is =" + Math.pow(5, 2));

//      07.Math.random() generates an random number everthime it is called.
        System.out.println("Random Number is =" + Math.random());

        /**
         * 08.random number between 0 and 100, you can use the following
         * formula.
         *
         */
        int randomIntNum = (int) (Math.random() * 101);  // (int) means convert what ever Math.random()*101 return into integer
        float randomFloatNum = (float) (Math.random() * 101);  // (int) means convert what ever Math.random()*101 return into floating number
        System.out.println("Random Integer Number is =" + randomIntNum);
        System.out.println("Random Flot Number is =" + randomFloatNum);
        
        
//      9.Euler's Number /e
        System.out.println("Euler's Number is =" + Math.E);
        
//      10.PI Number
        System.out.println("PI  Number is =" + Math.PI);
        
    }
}
