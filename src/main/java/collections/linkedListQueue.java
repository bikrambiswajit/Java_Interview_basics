package collections;

import java.util.LinkedList;
import java.util.Queue;

public class linkedListQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(21);
		q.offer(54);
		q.offer(23);
		System.out.println(q);
		
		q.poll();
		System.out.println(q);

	}

}
