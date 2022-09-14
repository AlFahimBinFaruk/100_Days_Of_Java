package LinkedList.BasicExample;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args){
        LinkedList<Person> personList=new LinkedList<Person>();

        Person personOne=new Person("Fahim","Male",33,true);
        Person personTwo=new Person("Suhana","Female",43,false);
        Person personThree=new Person("Akib","Male",23,true);

        // add person to list
        personList.add(personOne);
        personList.add(personTwo);
        personList.add(personThree);

        // looping through personList.
        for(Person person : personList){
            System.out.println("Person name : "+person.name+
                    ", gender : "+person.gender+
                    ", age : "+person.age+
                    ", programmer : "+person.isProgrammer);
        }


    }
}
