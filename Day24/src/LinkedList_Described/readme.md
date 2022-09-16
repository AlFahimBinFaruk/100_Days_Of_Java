## See Day 11 linkedList for code example.

### LinkedList
* The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
  However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very **differently**.
* The LinkedList class has all of the same methods as the **ArrayList** class because they both implement the **List** interface. 
  This means that you can **add items**, **change items**, **remove items** and **clear the list** in the same way.
* Linked list class uses **doubly linked list** to store the items.
* **Manipulation** of data is fast here (deleting and inserting).
* Can contain **duplicate** elements.

#### How the ArrayList works
* The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

#### How the LinkedList works
* LinkedList is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node.
* The LinkedList stores its items in **containers**. The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
* Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. It also has a few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach a node we wish to access.
* Since a LinkedList acts as a dynamic array and we do not have to specify the size while creating it, the size of the list automatically increases when we dynamically add and remove items. And also, the elements are not stored in a continuous fashion. Therefore, there is no need to increase the size. Internally, the LinkedList is implemented using the doubly linked list data structure.
* The main difference between a normal linked list and a doubly LinkedList is that a doubly linked list contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.

#### Constructors in the LinkedList:
* In order to create a LinkedList, we need to create an **object** of the LinkedList class. The LinkedList class consists of various **constructors** that allow the possible creation of the list.

### When To Use
* Use an **ArrayList** for storing and accessing data, 
* **LinkedList** to manipulate data.

### Resources.
* [Java Linkedlist - w3Schools](https://www.w3schools.com/java/java_linkedlist.asp)
* [Java Linkedlist and all linked list method list - geeks for geeks - important blog](https://www.geeksforgeeks.org/linked-list-in-java/)