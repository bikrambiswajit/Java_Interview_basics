package collections;

import java.util.Deque;
import java.util.ArrayDeque;

public class arrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();

		        // Add elements 
		        adq.offer(10);
		        adq.offerFirst(26);
		        adq.offerLast(43);
		        adq.offer(21);
		        adq.offer(4);
		        adq.offerFirst(10);
		        
		        System.out.println(adq);
		        
		        System.out.println("Peek "+ adq.peek());
		        System.out.println("PeekFirst "+ adq.peekFirst());
		        System.out.println("PeekLast "+ adq.peekLast());
		        
		        
		        System.out.println(adq.poll());
		        System.out.println(adq);
		        System.out.println(adq.pollFirst());
		        System.out.println(adq);
		        System.out.println(adq.pollLast());
		        System.out.println(adq);

		        
		
	}

}
