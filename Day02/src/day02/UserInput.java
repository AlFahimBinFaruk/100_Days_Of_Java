package day02;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        System.out.println("Running User Input!");

        /*
        For More 
        01.Watch this => https://www.youtube.com/watch?v=Po8bPEFsnow&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=10
        02.Read this =>https://www.w3schools.com/java/java_user_input.asp
         */
        
        /*
        we will initialize scanner in input which will take user input everytime we call it
        */
        Scanner input = new Scanner(System.in);
        /**
         * ******
         * nextLine(),next() Reads a String value from the user ********
         */
//      getting username
        System.out.print("Enter Username: ");
        String username;
        username = input.nextLine();//print the whole line

//      getting gender
        System.out.print("Enter Gender: ");
        String gender;
        gender = input.next();//prints only first/one word. ignores everything after space

        /**
         * ****
         * nextInt() Reads a int value from the user ****
         */
        int age;
        System.out.print("Enter your age: ");
        age = input.nextInt();

        /*
        nextDouble() Reads a double value from the user
         */
        double iDouble;
        System.out.print("Enter a double number: ");
        iDouble = input.nextDouble();

        /*
        nextFloat() Reads a float value from the user
         */
        float iFloat;
        System.out.print("Enter a float number: ");
        iFloat = input.nextFloat();

        /*
        nextBoolean() Reads a boolean value from the user
         */
        boolean iBool;
        System.out.print("Enter a boolean: ");
        iBool = input.nextBoolean();

        /**
         * *******print all of them**********
         */
        System.out.println("Username is =>" + username
                + "\n Gender is =>" + gender
                + "\n Age is =>" + age
                + "\n entered double number is =>" + iDouble
                + "\n entered float number is =>" + iFloat
                + "\n entered Boolean is =>" + iBool);

    }
}
