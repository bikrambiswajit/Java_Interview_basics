package collections;

import java.util.ArrayList;
import java.util.Collections;

public class collectionClass {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(32);
		list.add(21);
		list.add(31);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list, 4));
		Collections.sort(list);
		System.out.println(list);
	}

}
