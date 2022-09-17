## see Day 14 fileSystem of code example.

### File System.
* If a file with same name or folder exits it will not do anything.
* Always use try/catch block while working with files.
* To write and read files in Java we use:
    * **Formatter**.
    * **FileWriter**.
    * FileReader.
    * BufferedReader.
    * Files.
    * **Scanner**.
    * FileInputStream.
    * BufferedWriter.
    * FileOutputStream.

#### The File class has many useful methods for creating and getting information about files. For example:
* **canRead():**	Boolean	Tests whether the file is readable or not
* **canWrite():**	Boolean	Tests whether the file is writable or not
* **createNewFile():**	Boolean	Creates an empty file
* **delete():**	Boolean	Deletes a file
* **exists():**	Boolean	Tests whether the file exists
* **getName():**	String	Returns the name of the file
* **getAbsolutePath():**	String	Returns the absolute pathname of the file
* **length():**	Long	Returns the size of the file in bytes
* **list():**	String[]	Returns an array of the files in the directory
* **mkdir():**	Boolean	Creates a directory

#### Create a File
* To create a file in Java, you can use the createNewFile() method. This method returns a boolean value: 
  true if the file was successfully created, and false if the file already exists. 
* Note that the method is enclosed in a **try...catch block**. This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason):
  * [Create and write Files in Java - w3Schools](https://www.w3schools.com/java/java_files_create.asp)
* To create a file in a specific directory (requires permission), specify the path of the file and use double backslashes to escape the "\" character (for Windows). On Mac and Linux you can just write the path, like: /Users/name/filename.txt

#### Note:
* There are many available classes in the Java API that can be used to read and write files in Java: FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc. Which one to use depends on the Java version you're working with and whether you need to read bytes or characters, and the size of the file/lines etc.

### Important resources
* [Java Files - w3Schools](https://www.w3schools.com/java/java_files.asp)
* [Create and write Files in Java - w3Schools](https://www.w3schools.com/java/java_files_create.asp)
* [Read files in Java - w3Schools](https://www.w3schools.com/java/java_files_read.asp)
* [Delete files in Java -w3Schools](https://www.w3schools.com/java/java_files_delete.asp)