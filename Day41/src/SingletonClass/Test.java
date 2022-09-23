package SingletonClass;

public class Test {
    public static  void main(String[] args){
        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
    }
}
