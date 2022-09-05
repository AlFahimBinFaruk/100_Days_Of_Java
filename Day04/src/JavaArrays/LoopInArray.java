package JavaArrays;

public class LoopInArray {

    public static void main(String[] args) {
        System.out.println("******** Running for loop!! **********");

//      for loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println("For loop active car is => " + cars[i]);
        }

        System.out.println("****** Runnning For each loop *****");
//      for each loop
        for (String i : cars) {
            System.out.println("For each loop active car is => " + i);
        }
    }

}
