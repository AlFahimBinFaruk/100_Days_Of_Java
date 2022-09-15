package FileSystem.Exmaple;

import java.io.File;


public class WorkingWithFile {
    public static void main(String[] args) {
        System.out.println("******** Running working with File. *******");

        File myFile=new File("F:/Java/Day14/src/DynamicFolderTwo/fahim.txt");
        File myFileTwo=new File("F:/Java/Day14/src/DynamicFolderTwo/suhan.txt");

        /** you have to use try/catch block while creating new file. **/
        try{
            // create new file
            myFile.createNewFile();
            myFileTwo.createNewFile();
        }catch (Exception e){
            System.out.println("Folder creation Exception : "+e);
        }

        // see if the file exits.
        if(myFile.exists()){
            String myFilePath=myFile.getAbsolutePath();
            System.out.println("File exits at : "+myFilePath);
        }

        // delete file
        if(myFileTwo.delete()){
            String myFileTwoName=myFileTwo.getName();
            System.out.println("Deleted : "+myFileTwoName);
        }
    }
}
