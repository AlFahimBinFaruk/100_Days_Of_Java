package day02;

public class Variables {

    public static void main(String[] args) {
        System.out.println("Running Variables!");

        /* 01. String - stores text, such as "Hello". 
           String values are surrounded by double quotes
         */
        String myString = "fahim";
        System.out.println(myString);

        /*02. int - stores integers (whole numbers), 
        without decimals, such as 123 or -123
         */
        int myInt = 423;
        System.out.println(myInt);

        /*03. float - stores floating point numbers, 
        with decimals, such as 19.99 or -19.99
         */
        float myFloat = 33;
        float myFloatTwo = 44.4455f;
        System.out.println(myFloat);
        System.out.println(myFloatTwo);

        /*04. char - stores single characters, such as 'a' or 'B'. 
        Char values are surrounded by single quotes 
        Alternatively, if you are familiar with ASCII values, you can use those to display certain characters.
        A list of all ASCII values can be found in our 
        ASCII Table Reference=> https://www.w3schools.com/charsets/ref_html_ascii.asp. (very important)
        there are 128 ASCII characters and their equivalent number from 0 to 128
         */
        char myChar = 'F';
        char myCharTwo = 44;
        System.out.println(myChar);
        System.out.println(myCharTwo);

        /* 05. boolean - stores values with two states: true or false
         */
        boolean myBool = true;
        boolean myBoolTwo = false;
        System.out.println(myBool);
        System.out.println(myBoolTwo);

//      Examples of re-assigining values
        int myNum = 33;
        myNum = 44;
        System.out.println(myNum);

        /*
        Final Variables -
        If you don't want others (or yourself) to 
        overwrite existing values, use the final 
        keyword (this will declare the variable 
        as "final" or "constant", 
        which means unchangeable and read-only):
         */
        final int myFinalNum = 43;
//      myFinalNum=33; => you can't re-assing a final statement
        System.out.println(myFinalNum);
    }
}
