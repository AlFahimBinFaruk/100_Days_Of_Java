package StringComparison;

public class Test {
    public static void main(String[] args){
        String passwordOne="fahim33";
        String passwordTwo="fahim33";
        String passwordThree=new String("fahim33");
        String passwordFour=new String("fahim33");

        /**
         * main difference between equal method (equal()) and operator(==) in Java is that "==" is used to
         * compare primitive data type while equal() is recommended to check equality of objects.
         * */
        // 01.equal() : compares the original content of the string.
        System.out.println("********* equal() ********");
        System.out.println("passwordOne equal() passwordTwo => "+passwordOne.equals(passwordTwo));
        System.out.println("passwordOne equal() passwordThree => "+passwordOne.equals(passwordThree));
        System.out.println("passwordThree equal() passwordFour => "+passwordThree.equals(passwordFour));

        // 02.equalsIgnoreCase() : compares the original content of the string irrespective of the case.
        System.out.println("********* equalsIgnoreCase() ********");
        System.out.println("passwordOne equalsIgnoreCase() passwordTwo => "+passwordOne.equalsIgnoreCase(passwordTwo));
        System.out.println("passwordOne equalsIgnoreCase() passwordThree => "+passwordOne.equalsIgnoreCase(passwordThree));
        System.out.println("passwordThree equalsIgnoreCase() passwordFour => "+passwordThree.equalsIgnoreCase(passwordFour));

        // 02.equal operator (==) : compares the reference of the object not value/original content.
        System.out.println("********* equal operator (==) ********");
        System.out.println("passwordOne equal operator (==) passwordTwo => "+(passwordOne==passwordTwo));
        System.out.println("passwordOne equal operator (==) passwordThree => "+(passwordOne==passwordThree));
        System.out.println("passwordThree equal operator (==) passwordFour => "+(passwordThree==passwordFour));
    }
}
