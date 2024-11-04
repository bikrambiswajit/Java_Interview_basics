package collections;

import java.util.Arrays;

public class arraysClass {

	public static void main(String[] args) {

		int[] a = {2, 4, 5, 2 ,6 ,4 ,7 , 8, 9, 7};
		int index = Arrays.binarySearch(a, 5);
		
		System.out.println("The index of element 5 is " + index);
		Arrays.sort(a);
		for(int i:a){

			System.out.println(i);
		}

}
}
