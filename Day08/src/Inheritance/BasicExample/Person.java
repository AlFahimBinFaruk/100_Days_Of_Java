package Inheritance.BasicExample;

public class Person {
    String name,gender;
    int age;

    public void setPersonInfo(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void printPersonInfo(){
        System.out.println("Employee Name =>"+name+", gender => "+gender+", age => "+age);
    }
}
