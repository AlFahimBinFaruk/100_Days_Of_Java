package toString;

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    // toString() is a built-in method (Object class method) of java that we have overwritten here.
    @Override
    public String toString(){
        return "Person name : "+name+" and age : "+age;
    }
}
