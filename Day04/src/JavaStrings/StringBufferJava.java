package JavaStrings;

public class StringBufferJava {

    public static void main(String[] args) {
        System.out.println("Running String Buffer");
        
        /******
         *Read this => https://www.geeksforgeeks.org/stringbuffer-class-in-java/.
         ******/

//      Basic systax
        StringBuffer sb = new StringBuffer("Hello ");

//      01.append()
        sb.append("Java");//now original string is changed 
        System.out.println("Append => "+sb);

//      02.insert(index number,value)
        sb.insert(0, " Python ");   //now original string is changed 
        System.out.println("Insert => "+sb);
        
        
//      03.replace()
        StringBuffer sbTwo=new StringBuffer("Hello"); 
        sbTwo.replace(1,3,"Java"); //replace from index 1 to 2
        System.out.println("Replace => "+sbTwo);
        
//      04.delete()
        StringBuffer sbThree=new StringBuffer("Hello"); 
        sbThree.delete(1,4); //delete index 1 from 3
        System.out.println("Delete => "+sbThree);
        
        
//      05.Reverse()
        sb.reverse(); 
        System.out.println("Reverse => "+sb);
        
//      06.capacity()
        System.out.println("Capacity => "+sb.capacity());//default 16 
    }

}
