package Java.Day8;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <String> q = new Stack<String>();
		
		q.add("xxx");
		q.add("yyy");
		q.add("zzz");
		
		int qSize = q.size();
		
		for (int i=0; i < qSize; i++) {
			System.out.println(q.pop());  // to remove
			System.out.println(q.size());
		}
		
	}

}
