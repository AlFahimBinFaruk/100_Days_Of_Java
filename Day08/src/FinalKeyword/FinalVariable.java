package FinalKeyword;

public class FinalVariable {

    // Read : https://www.w3schools.com/java/ref_keyword_final.asp , https://www.geeksforgeeks.org/final-keyword-in-java/
    // Watch : https://www.youtube.com/watch?v=__vHJJf5vWc
    /**
     * it is a convention to write final variable name in capital letter, you can use small letter if you want.
     * */
    final String NAME="Fahim";// final variable

    /**
     * Blank final variable can only be initialized inside a constructor
     * **/
    final int AGE;// blank final variable

    // constructor
    FinalVariable(){
        AGE=33;
    }

    /**
     * Static blank final variables can only be initialized inside a static block
     * */
    static final String COUNTRY;// Static blank final variable.

    // Static block
    static {
        COUNTRY="BD";
    }


}
