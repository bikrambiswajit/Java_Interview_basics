package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//studentName.add("Rakesh");
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.add(1,7);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(7);
		list2.add(40);
		
		list.addAll(list2);
		
		System.out.println(list);
		
		list.set(1, 100);
		System.out.println(list);
		System.out.println(list.contains(40));
		
		for(Integer e :list){
			System.out.println(e);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		list.remove(3);
//		list.remove(Integer.valueOf(40));
//		
//		System.out.println(list);
		
	}

}
