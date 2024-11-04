package collections;

import java.util.PriorityQueue;
import java.util.Queue;

import java.util.Comparator;

public class priorityQueue {

	public static void main(String[] args) {

		//Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		Queue<Integer> pq = new PriorityQueue<>();
			pq.offer(21);
			pq.offer(42);
			pq.offer(8);
			pq.offer(36);
			pq.offer(1);
			
			System.out.println(pq);
			
			pq.poll();
			
			System.out.println(pq);

	}

}
