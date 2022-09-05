package JavaStrings;

public class StringConcatination {

    public static void main(String[] args) {
        System.out.println("Running String concatination!!");

//      01.With + method
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

//      02.with concat() method
        String thirdName = "John ";
        String forthName = "Doe";
        System.out.println(thirdName.concat(forthName));
    }
}
