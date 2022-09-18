### Iterators in Java.
* An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
* To use an Iterator, you must import it from the java.util package.
* The iterator() method can be used to get an Iterator for any collection: see **Example.java**

#### Removing Items from a Collection
* Iterators are designed to easily change the collections that they **loop through**. The remove() method can remove items from a collection while looping.
* **Note:** Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop.

### Resources
* [Java Iterators - w3Schools](https://www.w3schools.com/java/java_iterator.asp)