package JavaArrays;

public class MArrayLoop {

    public static void main(String[] args) {
        System.out.println("Running Multidimentional Array Loop !!");

        /**
         * **********
         * Read this to know more
         * =>https://www.w3schools.com/java/java_arrays_multi.asp. ***********
         */
        
        int[][] myNums = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        
//      Length of myNums
        System.out.println("********************Length of myNums is => " + myNums.length);
        
//      Length of first dimension
        System.out.println("********************Length of first dimension => " + myNums[0].length);
        
//      Length of second dimension
        System.out.println("********************Length of second dimension => " + myNums[1].length);
        
        
        for (int i = 0; i < myNums.length; i++) {
            for (int j = 0; j < myNums[i].length; j++) {
                System.out.println("Value of array dimension => " + myNums[i][j]);
            }
        }
    }
}
