package FileSystem.Exmaple;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try {
            File myFile=new File("F:/Java/Day14/src/FileSystem/DynamicFolderTwo/fahim.txt");

            // using scanner to read file.
            Scanner myFileScanner=new Scanner(myFile);

            // reading file line by line
            while(myFileScanner.hasNextLine()){
                System.out.println(myFileScanner.nextLine());
            }

            // close file scanner after reading.
            myFileScanner.close();;

        }catch (Exception e){
            System.out.println("Reading exception => "+e);
        }
    }
}
