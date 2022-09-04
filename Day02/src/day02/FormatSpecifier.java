package day02;

public class FormatSpecifier {

    public static void main(String[] args) {
        System.out.println("Running Format Specifier!");

        /*
        Read this to know in depth about Format specifier => http://www.java2s.com/Tutorials/Java/Data_Format/Java_Format_Specifier.htm
         */
//      These are basic examples there are many more use cases
        String S = "myString";
        boolean b = true;
        char c = 'a';
        short s = 33;
        int i = 33;
        float f = 44.44f;
        double d = 33.44;

        /*
        \n means new line
         */
//      %b and %B means boolean type format specifier
        System.out.printf("Boolean b = %b\n", b);//print in small letter 
        System.out.printf("Boolean b = %B\n", b);//print in capital letter

//      %c is for char type
        System.out.printf("Character c = %c\n", c);

//      %d is for short and int type
        System.out.printf("Short s = %d\n", s);
        System.out.printf("Integer i = %d\n", i);

//      %f is for float and double type
        System.out.printf("Float f = %f\n", f);
//      %.1 means print only one decimal value
        System.out.printf("Double d = %.1f\n", d);

//      %s and %S is for string type
        System.out.printf("String s = %s\n", S);
        System.out.printf("String s = %S\n", S);
    }
}
