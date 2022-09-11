public class InstanceVariableHiding {
    /****
     * In Java, if there is a local variable in a method with the same name as the instance variable,
     * then the local variable hides the instance variable this is call instance variable hiding.
     * To solve this problem we use "this" keyword.
     *****/

    // Read this :  https://www.geeksforgeeks.org/instance-variable-hiding-in-java/
    // Watch this : https://www.youtube.com/watch?v=r5klZTH1e9o

    String name;

    void setName(String name){
        this.name=name;
    }
}
