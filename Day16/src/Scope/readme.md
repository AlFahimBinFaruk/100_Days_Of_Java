### Scopes In Java.
* In Java, variables are only accessible inside the region they are created. This is called scope.

### Method Scope
* Variables declared directly inside a method are available anywhere in the method following 
  the line of code in which they were declared.

### Block Scope
* A block of code refers to all of the code between curly braces {}.
* Variables declared inside blocks of code are only accessible by the code between the curly braces, 
  which follows the line in which the variable was declared.
* A block of code may exist on its own or it can belong to an if, while or for statement. 
  In the case of for statements, variables declared in the statement itself are also available 
  inside the block's scope.
  * This means if we declare anything new inside if,else statement ,for,while loops they are also block statement,
   they cannot be accessed outside.

### Important resources 
* [Java Scope.](https://www.w3schools.com/java/java_scope.asp)