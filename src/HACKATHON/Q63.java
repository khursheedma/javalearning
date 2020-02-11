package HACKATHON;

/*
 * Q 63. What is multithreading, serialization and Generics in Java 
 * 
 * Multithreading in java is a process of executing multiple threads simultaneously.
 * A thread is a lightweight sub-process, the smallest unit of processing. It uses a shared memory area. 
 * 
 * Advantages of Java Multithreading
 * 1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
 * 2) You can perform many operations together, so it saves time.
 * 3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
 * 
 * Serialization:
 * Serialization is a mechanism of converting the state of an object into a byte stream
 * The byte stream created is platform independent. 
 * So, the object serialized on one platform can be deserialized on a different platform.
 * 
 * To make a Java object serializable we implement the java.io.Serializable interface.
 * The ObjectOutputStream class contains writeObject() method for serializing an Object.
 * 
 * public final void writeObject(Object obj) throws IOException
 * 
 * The ObjectInputStream class contains readObject() method for deserializing an object.
 * 
 * public final Object readObject() throws IOException, ClassNotFoundException
 * 
 * Advantages of Serialization
 * 	1. To save/persist state of an object.
 * 	2. To travel an object across a network.
 * 
 * Generics:
 * Generics in Java is similar to templates in C++. 
 * To allow type (Integer, String, … etc and user defined types) to be a parameter to methods, classes and interfaces. 
 * For example, classes like HashSet, ArrayList, HashMap, etc use generics.
 * 
 * // To create an instance of generic class 
 * 
 * BaseType <Type> obj = new BaseType <Type>()
 * Note: In Parameter type we can not use primitives like 'int','char' or 'double'. 
 * 
 * An generic example given below.
 */

class Example<T> 
{ 
    // An object of type T is declared 
    T obj; 
    Example(T obj) {  this.obj = obj;  }  // constructor 
    public T getObject()  { return this.obj; } 
} 

public class Q63 {

	public static void main(String[] args) {
		
		// instance of Integer type 
        Example <Integer> iObj = new Example<Integer>(50); 
        System.out.println(iObj.getObject()); 
   
        // instance of String type 
        Example <String> sObj = new Example<String>("Hello!"); 
        System.out.println(sObj.getObject()); 
	}
}
