package HACKATHON;

/*
 * Q37. What is JVM and explain me the Java memory allocation 
 * 
 * Answer :
 * JVM is a :
    1. A specification where working of Java Virtual Machine is specified. 
    But implementation provider is independent to choose the algorithm. 
    Its implementation has been provided by Oracle and other companies.
    2. An implementation Its implementation is known as JRE (Java Runtime Environment).
    3. Runtime Instance Whenever you write java command on the command prompt to run the java class, an instance of JVM is created.
	
	Java memory allocation :
	1.  Class(Method) Area
		Class(Method) Area stores per-class structures such as the runtime constant pool, field and method data, the code for methods.
	
	2.  Heap 
		It is the runtime data area in which objects are allocated.
	
	3.  Stack
		Java Stack stores frames. It holds local variables and partial results, and plays a part in method invocation and return.

		Each thread has a private JVM stack, created at the same time as thread.

		A new frame is created each time a method is invoked. A frame is destroyed when its method invocation completes.
	
	4.  Program Counter Register
		PC (program counter) register contains the address of the Java virtual machine instruction currently being executed.
	
	5. 	Native Method Stack
		It contains all the native methods used in the application.
 */

public class Q37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
