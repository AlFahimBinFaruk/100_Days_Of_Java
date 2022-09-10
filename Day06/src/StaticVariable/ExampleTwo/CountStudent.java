package StaticVariable.ExampleTwo;

public class CountStudent {
    int myCount=0;
    static int myStaticCount=0;

    public CountStudent(){
        myCount++;
        myStaticCount++;

    }

    //print output
    public void printOutput(){
        System.out.println("My count => "+myCount);
        System.out.println("Static Count => "+myStaticCount);
    }

}
