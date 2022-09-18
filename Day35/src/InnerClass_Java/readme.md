### Inner class in Java.
* In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
* To access the inner class, create an object of the outer class, and then create an object of the inner class: see InnerClass_Java

#### Private Inner Class
* Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:see InnerClass_Java 
  * If you try to access a private inner class from an outside class, an error occurs(you cannot access private inner class just like private methods,attributes)

#### Static Inner Class
* An inner class can also be static, which means that you can access it without creating an object of the outer class: see InnerClass_Java
  * just like static attributes and methods, a static inner class does not have access to members of the outer class.

### Resources.
* [Java Inner class - w3Schools](https://www.w3schools.com/java/java_inner_classes.asp)