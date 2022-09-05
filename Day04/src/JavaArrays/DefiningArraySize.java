package JavaArrays;

public class DefiningArraySize {

    public static void main(String[] args) {
        System.out.println("Defining array size!!");
        
        /***********
        *This syntax is not used that much.
        *************/
        int[] myNums = new int[3];//it means length of array will be 3.

//      myNums={12,3,6}; this will not work if you use new keyword to define the length of the array earlier..
        myNums[0] = 2;
        myNums[1] = 22;
        myNums[2] = 44;

        for (int i : myNums) {
            System.out.println("Printing number => " + i);
        }
    }
}
