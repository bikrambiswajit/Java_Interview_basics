package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {

	public static void main(String[] args) {

		//Set<Integer> set = new HashSet<Integer>();
		//Set<Integer> set = new TreeSet<Integer>(); //TreeSet gives sorted value
		
		Set<student> studentSet = new HashSet<>();
		
		studentSet.add(new student("Vikas", 1));
		studentSet.add(new student("Rahul", 2));
		studentSet.add(new student("Dev", 3));
		studentSet.add(new student("Vikas", 1)); //being skipped as duplicate
		studentSet.add(new student("Sachin", 4));
		
		System.out.println(studentSet);
		
//		set.add(10);
//		set.add(42);
//		set.add(31);
//		set.add(76);
//		set.add(2);
//		set.add(62);
//		
//		System.out.println(set);
//		
//		System.out.println(set.remove(76));
//		System.out.println(set.contains(76));
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		set.clear();
//		System.out.println(set);
//		

	}

}
