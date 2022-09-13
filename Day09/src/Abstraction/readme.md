### What is Abstraction?
* Data abstraction is the process of hiding certain details and showing only essential information to the user.
  Abstraction can be achieved with either **abstract** classes or **interfaces** 
* Abstraction refers to hiding the internal implementation of the feature and only showing the functionality to the users.
* Only classes and methods can be abstracted.

* In java, abstraction is achieved by interfaces and abstract classes. 
  * We can achieve 100% abstraction using interfaces.
  * We can achieve 0-100% abstraction using abstract class.

* The abstract keyword is a non-access modifier, used for classes and methods
  * **Abstract class**: is a restricted class that cannot be used to create objects (to access it, 
    it must be inherited from another class).
  * **Abstract method**: can only be used in an abstract class, 
    and it does not have a body. The body is provided by the subclass (inherited from).
  
* An abstract class can have both abstract and regular methods.
* If you extend an abstract class you have to use all it's abstract methods.Or you have to declare the sub-class abstract itself.
* Members of a Java interface are public by default. 
* A Java abstract class can have class members like private, protected, etc.

### Abstract classes and Abstract methods :
  * An abstract class is a class that is declared with an abstract keyword.
  * An abstract method is a method that is declared without implementation.
  * An abstract class may or may not have all abstract methods. Some of them can be concrete methods
  * A method-defined abstract must always be redefined in the subclass, **thus making overriding compulsory** or making the subclass itself abstract.
  * Any class that contains one or more abstract methods must also be declared with an abstract keyword.
  * There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
  * An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.

### Advantages of Abstraction
* It reduces the complexity of viewing things.
* Avoids code duplication and increases reusability.
* Helps to increase the security of an application or program as only essential details are provided to the user.
* It improves the maintainability of the application.
* It improves the modularity of the application.
* The enhancement will become very easy because without affecting end-users we can perform any type of changes in our internal system. 

### Important Resources.
* <a href="https://www.geeksforgeeks.org/abstraction-in-java-2/">Abstraction in Java</a>
* <a href="https://www.w3schools.com/java/java_abstract.asp">Java Abstraction</a>
* <a href="https://www.youtube.com/watch?v=XUvnPcnYsHM">Java Abstraction theory - Anisul islam</a>
* <a href="https://www.youtube.com/watch?v=P_Yb5CQFh3Y">Java Abstraction practical - Anisul islam</a>