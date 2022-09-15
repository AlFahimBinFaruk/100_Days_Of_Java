package FileSystem.Exmaple;

import java.io.File;

public class WorkingWithFolder {
    public static void main(String[] args){
        System.out.println("******** Running working with Folder. *******");

        //File myFolder=new File("DynamicFolderTest");// this will create folder at the project root.
        File myFolder=new File("F:/Java/Day14/src/FileSystem/DynamicFolder");// declare folder path.

        // create new folder.
        myFolder.mkdir();

        // see the folder is created or exits.
        if(myFolder.exists()){
            String folderPath=myFolder.getAbsolutePath();// get the absolute path of the folder.
            System.out.println("Folder created at => "+folderPath);
        }else{
            System.out.println("Failed to create.");
        }

        // delete folder
           myFolder.delete();

        if(!myFolder.exists()){
            String folderName=myFolder.getName();// get the folder name.
            System.out.println("Deleted folder => "+folderName);
        }else{
            System.out.println("Failed to delete.");
        }
    }
}
