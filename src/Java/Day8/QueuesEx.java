package Java.Day8;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("xxx");
		q.add("yyy");
		q.add("zzz");
		
		int qSize = q.size();
		
		for (int i=0; i < qSize; i++) {
			System.out.println(q.poll());  // to remove
			System.out.println(q.peek()); // to view NOT for remove
			System.out.println(q.size());
		}
		
	}

}
