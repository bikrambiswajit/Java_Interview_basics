package collections;

import java.util.Stack;

public class learnStack {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<String>();
		
		animals.push("Lion");
		animals.push("parrot");
		animals.push("horse");
		animals.push("kangaroo");
		System.out.println(animals.peek());  //to check the top item of stack
		animals.pop();
		System.out.println(animals);
		System.out.println(animals.peek());

	}

}
