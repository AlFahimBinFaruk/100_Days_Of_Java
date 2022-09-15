package HashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args){
        System.out.println("*********** Running Hashmap. ***********");

        // Syntax
        HashMap<Integer,String> studentList=new HashMap<Integer,String>();

        // add item.
        studentList.put(33,"Fahim");
        studentList.put(44,"Suhan");
        studentList.put(44,"MIzan");//suhan will be replaced by mizan.
        studentList.put(54,"Al fahim");
        studentList.put(64,"Faruk");

        // print the whole hashmap
        System.out.println("Hashmap of student list => "+studentList);

        // get item by key.
        System.out.println("My Item => "+studentList.get(33));


        // printing only keys of hashmap.
        System.out.println("*********** printing keys. ***********");
        for (Integer key: studentList.keySet()){
            System.out.println("Printing key => "+key);
        }


        // printing only values of hashmap.
        System.out.println("*********** printing values. ***********");
        for (String val: studentList.values()){
            System.out.println("Printing value => "+val);
        }


        //printing key and value pair.
        System.out.println("*********** printing key and value pair. ***********");
        for (Integer key: studentList.keySet()){
            System.out.println("For key : "+key+" value => "+studentList.get(key));
        }

        // remove item by key
        studentList.remove(44);
        System.out.println("My Item => "+studentList.get(44));

        // clear the whole hashmap size
        studentList.clear();

        // printing hash map size
        System.out.println("Hashmap size => "+studentList.size());
    }
}
