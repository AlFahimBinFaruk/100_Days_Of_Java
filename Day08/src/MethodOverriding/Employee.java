package MethodOverriding;

public class Employee extends Person {
    String language,address;
    int salary;

    public void setEmployeeInfo(String language,String address,int salary){
        this.language=language;
        this.address=address;
        this.salary=salary;
    }

    @Override
    public void printInfo(){
        System.out.println("Employee name =>"+name
                +", gender => "+gender
                +", age => "+age
                +", Language =>"+language
                +", address => "+address
                +", salary => "+salary);
    }
}
