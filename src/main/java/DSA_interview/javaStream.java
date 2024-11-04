package DSA_interview;

import java.util.Arrays;
import java.util.List;

public class javaStream {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(4,5,6,7,8,9);
		
		
		num.stream()
		.filter(n-> n%2==1)
		.sorted()
		.map(n-> n*2).forEach(n->System.out.println(n));

	}

}
