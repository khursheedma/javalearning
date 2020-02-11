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

class Stack{
	
	private int array[];
	int size;
	int index = 0;
	
	Stack(int size){
		this.size = size;
		this.array = new int[size];
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
	
	public void push(int item) {
		
		if (isFull()) {
			throw new StackOverflowError("Stack is full");
		}
		array[index] = item;
		index++;
	}
	
	int pop() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return array[--index];
	}
	
	int peek1() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return array[index];
	}
}

public class StackImplementation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial using stack operation : ");
		int num = sc.nextInt();
		
		System.out.println("Factorial of a number " + num + " = " + FindFactorialUsingStack(num));
	}

	public static int FindFactorialUsingStack(int num) {
		
		Stack st = new Stack(num);
		
		if (num == 0) {
			return 1;
		} else {
			for (int i=1; i <=num; i++) {
				st.push(i);
			}
		}
		
		int fact = 1;
		while (!st.isEmpty()) {
			int poppedEle = st.pop();
			// System.out.println("popped element = " + poppedEle);
			fact = fact * poppedEle;
			// System.out.println("Fact = " + fact);
		}
		return fact;
	}
}
