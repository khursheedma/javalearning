package Java.Day8.Assignments;

import java.util.EmptyStackException;
import java.util.Scanner;

/*
	Stack Implementation 
    Implement generic stack 
    Find factorial of given number using single stack 
    Reverse the given string using stack 
    Implement the dynamic stack 
 */

class GenericStack<T extends Object> {
	
	private T stackArray[];
	int size;
	int index = 0;
	
	@SuppressWarnings("unchecked")
	GenericStack(int size){
		this.size = size;
		this.stackArray = (T[]) new Object[size];
	}
	
	boolean isEmpty() {
		
		if (index == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (index == size) {
			return true;
		}
		return false;
	}
	
	int size() {
		return index;
	}
	
	void increaseStackSize() {
		@SuppressWarnings("unchecked")
		T[] newStack = (T[]) new Object[size*2];
		for (int i=0; i<size; i++) {
			newStack[i] = stackArray[i];
		}
		stackArray = newStack;
		size = size * 2;
	}
	
	public void push(T item) {
		
		if (isFull()) {
			System.out.println("Stack is full, increasing the size");
			increaseStackSize();
		}
		stackArray[index] = item;
		index++;
	}
	
	T pop() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stackArray[--index];
	}
	
	T peek() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stackArray[index];
	}
}

public class GenericStackImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to reverse using stack operation : ");
		String str1 = sc.nextLine();
		System.out.println("Reversed string of '" + str1 + "' is : " + ReverseStringUsingStack(str1));
		
		System.out.println("Enter the number to find the factorial using stack operation : ");
		int num = sc.nextInt();
		System.out.println("Factorial of a number " + num + " : " + FindFactorialUsingStack(num));
				
		sc.close();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static String ReverseStringUsingStack(String str1) {
		
		char[] strArray = str1.toCharArray();
		
		GenericStack gst = new GenericStack(strArray.length);
		
		for (int i=0; i <strArray.length; i++) {
				gst.push(strArray[i]);
		}
		
		String str2 = "";
		
		while (!gst.isEmpty()) {
			char poppedChar = (char) gst.pop();
			str2 = str2 + poppedChar;
		}
		return new String(str2);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int FindFactorialUsingStack(int num) {
		
		GenericStack gst = new GenericStack(num);
		
		if (num == 0) {
			return 1;
		} else {
			for (int i=1; i <=num; i++) {
				gst.push(i);
			}
		}
		
		int fact = 1;
		while (!gst.isEmpty()) {
			int poppedEle = (int) gst.pop();
			fact = fact * poppedEle;
		}
		return fact;
	}
}