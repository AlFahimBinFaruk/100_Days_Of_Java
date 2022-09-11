## Call By Value
* Definition = While calling a function, when you pass values by copying variables, it is known as “Call By Values.”
* Argument = In this method, a copy of the variable is passed.
* Effect = Changes made in a copy of variable never modify the value of variable outside the function.
* Alteration of value = Does not allow you to make any changes in the actual variables.
* Passing of variable = Values of variables are passed using a straightforward method.
* Value modification = Original value not modified.
* Memory Location = Actual and formal arguments
  will be created in different
  memory location
* Safety = Actual arguments remain
  safe as they cannot be modified
  accidentally.
* Default = Default in many programming
  languages like C++.PHP. Visual Basic NET, and C#.

### Advantages of using Call by value method
* The method dosen't change the original variable, so it is preserving data.
* Whenever a function is called it, never affect the actual contents of the actual arguments.
* Value of actual arguments passed to the formal arguments, so any changes made in the formal argument does not affect the real cases.
Advantages of using

### Disadvantages of using Call by value method
* Changes to actual parameters can also modify corresponding argument variables
* In this method, arguments must be variables.
* You can’t directly change a variable in a function body.
* Sometime argument can be complex expressions
* There are two copies created for the same variable which is not memory efficient.

## Call By Reference
* Definition = While calling a function, in programming language instead of copying the values of variables, the address of the variables is used it is known as “Call By References.
* Arguments = In this method, a variable itself is passed.
* Effect = Change in the variable also affects the value of the variable outside the function.
* Alteration of value = Allows you to make changes in the values of variables by using function calls.
* Passing of variable = Pointer variables are required to store the address of variables.
* Value modification = The original value is modified.
* Memory Location = Actual and formal arguments
  will be created in the same
  memory location
* Safety = Actual arguments are not
  Safe. They can be
  accidentally modified, so you need to handle arguments operations carefully.
* Default = It is supported by most
  programming languages like JAVA, but
  not as default.

### Advantages of using Call by reference method

* The function can change the value of the argument, which is quite useful.
* It does not create duplicate data for holding only one value which helps you to save memory space.
* In this method, there is no copy of the argument made. Therefore it is processed very fast.
* Helps you to avoid changes done by mistake
* A person reading the code never knows that the value can be modified in the function.


### Disadvantages of using Call by reference method

* Strong non-null guarantee. A function taking in a reference need to make sure that the input is non-null. Therefore, null check need not be made.
* Passing by reference makes the function not pure theoretically.
* A lifetime guarantee is a big issue with references. This is specifically dangerous when working with lambdas and multi-threaded programs.