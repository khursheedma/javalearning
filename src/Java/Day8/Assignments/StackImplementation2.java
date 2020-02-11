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

class Stackchar{
	
	private char array[];
	int size;
	int index = 0;
	
	Stackchar(int size){
		this.size = size;
		this.array = new char[size];
		// this.index = -1;
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
	
	public void push(char item) {
		
		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}
		array[index] = item;
		index++;
	}
	
	char pop() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return array[--index];
	}
	
	char peek() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return array[index];
	}
}

public class StackImplementation2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse using stack operation : ");
		String str1 = sc.nextLine();

		
		System.out.println("Reversed string of " + str1 + " = " + ReverseStringUsingStack(str1));
	}

	public static String ReverseStringUsingStack(String str1) {
		
		char[] strArray = str1.toCharArray();
		
		Stackchar st = new Stackchar(strArray.length);
		
		for (int i=0; i <strArray.length; i++) {
				st.push(strArray[i]);
		}
		
		String str2 = "";
		
		while (!st.isEmpty()) {
			char poppedChar = st.pop();
			// System.out.println("popped element = " + poppedEle);
			str2 = str2 + poppedChar;
			// System.out.println("Fact = " + fact);
		}
		return new String(str2);
	}
}
