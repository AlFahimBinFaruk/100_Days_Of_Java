package JavaArrays;

public class MultidimentionalArray {
    public static void main(String[] args) {
        System.out.println("Running Multidimentional Array !!");
        
        /************
        * Read this to know more =>https://www.w3schools.com/java/java_arrays_multi.asp
        * watch this very important =>https://www.youtube.com/watch?v=7gfVMC7x_QM.
        *************/
        
        int[][] myNums={{1,22,3,4},{5,6,7,8}};
        
//      to access the first dimension
        int x=myNums[0][2];
        System.out.println("Value => "+x);
        
//      to access the second dimension
        int y=myNums[1][3];
        System.out.println("Value of second dimention =>"+y);
        
    }
}
