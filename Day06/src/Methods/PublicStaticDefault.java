package Methods;

public class PublicStaticDefault {
    //Static methods can be called without creating objects
    static void myStaticMethod(){
        System.out.println("This is static method.");
    }

    //Public methods must be called by creating objects
    public void myPublicMethod(){
        System.out.println("This is public method.");
    }

    //Default methods must be called by creating objects
    void myDefaultMethod(){
        System.out.println("This is a default method");
    }

    //main
    public static  void main(String[] args){
        //calling static method
        myStaticMethod();

        //calling public method
        PublicStaticDefault myPublicObj=new PublicStaticDefault();
        myPublicObj.myPublicMethod();

        //calling default method
        myPublicObj.myDefaultMethod();
    }

}
