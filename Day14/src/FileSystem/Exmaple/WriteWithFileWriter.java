package FileSystem.Exmaple;

import java.io.FileWriter;

public class WriteWithFileWriter {
    public static void main(String[] args){
        /**
         * 01. if anything is already in that file it will rewrite it.
         * 02. if the folder don't exit it will give error.
         * 03. if the file don't exit it will create a new file in that path and write there.
         * */
       try{
           // file writer
           FileWriter myWriter=new FileWriter("F:/Java/Day14/src/FileSystem/DynamicFolderTwo/fa4him.txt");

           // write data
           myWriter.write("Suhan is writting \n");
           myWriter.write("Fahim is writting again.");

           // close file after writing.
           myWriter.close();

           System.out.println("Writing successful.");
       }catch (Exception e){
           System.out.println("File writing exception => "+e);
       }

    }
}
