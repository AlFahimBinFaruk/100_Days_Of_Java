### Finalize Method in Java
* Finalize method in Java is an Object Class method that is used to perform cleanup activity before destroying any object. It is called by Garbage collector before destroying the object from memory. Finalize() method is called by default for every object before its deletion.
* Example:
```bash
public class Demo {

	protected void finalize() throws Throwable
	{
		try 
        {
			System.out.println("Inside finalize method of   Demo Class.");
		}
		catch (Throwable e) 
        {

			throw e;
		}
		finally {

			System.out.println("Calling finalize method of the Object class");

			// Calling finalize() of Object class
			super.finalize();
		}
	}

	public static void main(String[] args) throws Throwable
	{

		// Creating demo's object
		demo d = new demo();

		// Calling finalize of demo
		d.finalize();
	}
} 
```

### Resources
* [Finalize method in Java.](https://www.scaler.com/topics/finalize-method-in-java/)