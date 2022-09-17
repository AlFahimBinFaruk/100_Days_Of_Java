## see Test.java for example

### Wrapper class.
* Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
* The table below shows the primitive type and the equivalent wrapper class:
* Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):
  * Example : 
    * ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    * ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
* Wrapper class have methods like : intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue()
* Another useful method is the toString() method, which is used to convert wrapper objects to strings.

####  Wrapper class list
* Primitive Data Type : Wrapper Class
* byte : Byte
* short : Short
* int : Integer
* long : Long
* float : Float
* double : Double
* boolean : Boolean
* char : 	Character

### Resources
* [Java Wrapper class - w3Schools](https://www.w3schools.com/java/java_wrapper_classes.asp)