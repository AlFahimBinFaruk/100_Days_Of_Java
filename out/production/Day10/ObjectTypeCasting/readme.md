### Object/Class Type Casting.
* There are two kinds of object type casting in Java:
    * Up Casting.
      * Upcasting is casting a subtype to a super type in an upward direction to the inheritance tree.
        It is an automatic procedure for which there are no efforts poured in to do so where a sub-class
        object is referred by a superclass reference variable. One can relate it with dynamic polymorphism.
        Implicit casting means class typecasting done by the compiler without cast syntax.
        Explicit casting means class typecasting done by the programmer with cast syntax.
    * Down Casting.
      * Downcasting refers to the procedure when subclass type refers to the object of the parent class is known as downcasting. If it is performed directly compiler gives an error as ClassCastException is thrown at runtime. It is only achievable with the use of instanceof operator The object which is already upcast, that object only can be performed downcast.
        In order to perform class type casting we have to follow these two rules as follows:
          * Classes must be “IS-A-Relationship “
          * An object must have the property of a class in which it is going to cast.
      * Downcasting is **not possible** in java