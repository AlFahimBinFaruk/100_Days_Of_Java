package SingletonClass;

public class Singleton {
    private Singleton(){};

    // instance will be null if the class in called for the first time
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance =new Singleton();
        }
        return  instance;
    }
}
