package Loops;

public class ForEachLoop {

    public static void main(String[] args) {
        System.out.println("Running For Each Loop.");

        String[] cars = {"BMW", "Bugatti", "Land Rover", "Proche"};
        
//      for each loop syntax
        for (String i : cars) {
            System.out.println("Active Car is =>" + i);
        }

    }
}
