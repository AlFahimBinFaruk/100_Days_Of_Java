### Singleton class
* In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time. 
After the first time, if we try to **instantiate** the Singleton class, the **new variable also points to the first instance created**. So whatever modifications we do to any variable inside the class through any instance, affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined. 

#### Remember the key points while defining class as a singleton class that is while designing a singleton class: 
* Make a constructor private.
* Write a static method that has the return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.