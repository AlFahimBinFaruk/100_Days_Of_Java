package FileSystem.Exmaple;

import java.util.Formatter;

public class WriteWithFormatter {
    public static void main(String[] args){
        /**
         * 01. if anything is already in that file it will rewrite it.
         * 02. if the folder don't exit it will give error.
         * 03. if the file don't exit it will create a new file in that path and write there.
         * */

        //Format specifiers list : https://www.geeksforgeeks.org/format-specifiers-in-java/.

        try{
            // formatter
            Formatter myFormatter =new Formatter("F:/Java/Day14/src/FileSystem/DynamicFolderTwo/fa2him.txt");
            // write in that file
            myFormatter.format("%s %s \n","Zayn","BD");// %s,$f are format specifier.
            myFormatter.format("%s %f %s \n","Akib",33.33f,"India");

            // close the file after writing.
            myFormatter.close();

            System.out.println("Writing successful.");
        }catch (Exception e){
            System.out.println("File writing exception => "+e);
        }
    }
}
