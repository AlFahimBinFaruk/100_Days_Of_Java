package Loops;

public class BreakAndContinue {

    public static void main(String[] args) {
        System.out.println("*********Running Break.***********");

//      Break statement is used to jump out of a loop.
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
//      for the loop and line  execution will stop here
                break;
            }
            System.out.println("Value of I is =>" + i);
        }

        System.out.println("*********Running Continue.***********");
//      Continue statement is used to skip the execution of loop.
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
//      line  execution will stop here but loop will not stop
                continue;
            }
            System.out.println("Value of I is =>" + i);
        }
    }
}
