package Encapsulation_Described;

public class Example {
    private String myPrivateName="Fahim";

    //get my name
    public String getMyName(){
        return myPrivateName;
    }

    //set my name
    public void setMyName(String name){
        myPrivateName=name;
    }
}
