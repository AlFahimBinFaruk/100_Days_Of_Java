package JavaStrings;

public class BasicString {

    public static void main(String[] args) {
        System.out.println("Running basic string!!!");

        /**
         * *****
         * To know more::: Read =>
         * https://www.w3schools.com/java/java_strings.asp ,video =>
         * https://www.youtube.com/watch?v=CWbO9tf1iGk , all string methods =>
         * https://www.w3schools.com/java/java_ref_string.asp. ***
         */
//      01.Finding out string lenght
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

//      02.Upper and lower case in string
        String txtTwo = "Hello World";
        System.out.println(txtTwo.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txtTwo.toLowerCase());   // Outputs "hello world"

//      03.Finding a character in string
        String txtThree = "Please locate where 'locate' occurs!";
        System.out.println(txtThree.indexOf("locate")); // Outputs 7

//      04.Compare two strings
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false

//      05.Compare strings to find out if they are equal, ignoring case differences:
        String myStr4 = "Hello";
        String myStr5 = "HELLO";
        String myStr6 = "Another String";
        System.out.println(myStr4.equalsIgnoreCase(myStr5)); // true
        System.out.println(myStr4.equalsIgnoreCase(myStr6)); // false

//      06.Contains Find out if a string contains a sequence of characters:
        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false

//      07.Ends with => Find out if the string ends with the specified characters
        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true

//      08.starts with => Find out if the string start with the specified characters
        System.out.println(myStr.startsWith("Hel"));   // true
        System.out.println(myStr.startsWith("llo"));   // false
        System.out.println(myStr.startsWith("o"));     // false

//      09.Split() truns string into an array
        String str = "geekss@for@geekss@geeks@geeks";
//      in split(depending on which character,how many items)
//      if you dont give any second args it will create as many item need
        String[] arrOfStrOne = str.split("@");
        for (String a : arrOfStrOne) {
            System.out.println("Array of string item one => " + a);
        }

//      it will create only two items
        String[] arrOfStrTwo = str.split("@", 2);
        for (String a : arrOfStrTwo) {
            System.out.println("Array of string item two => " + a);
        }

//      10.replace()
        String mystr = "Hello";
        String mystrReplaced = mystr.replace('l', 'p');
        System.out.println("Example of replace()=> " + mystrReplaced);

    }
}
