package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> num = new TreeMap<>();
		num.put("one", 1);
		num.put("two", 2);
		num.put("three", 3);
		//num.put("One", 5); //Duplicate Key , so it will not be added to map
		
		num.putIfAbsent("one", 5);
		
		System.out.println(num);
		
		for(Map.Entry<String, Integer> e : num.entrySet()){
			System.out.println(e);
		}
		
		//Print Ket set
		for(String Key: num.keySet()){
			System.out.println(Key);
		}
		
		//Print Value Set
		
		for(Integer Value: num.values()){
			System.out.println(Value);
		}
		
		System.out.println(num.containsKey("two"));
		System.out.println(num.containsValue(43));
		num.clear();
		System.out.println(num.isEmpty());

	}

}
