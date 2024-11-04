package Java_interview.Java_interview;

import java.util.ArrayList;

public class removeDuplicateNumberArray {

	public static void main(String[] args) {
		int[] a={1,5,2,7,6,2,5,1,4,7,3,9,3,9,2,5,0};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++){
			
			if(!al.contains(a[i])){
				al.add(a[i]);
			}
		}
		
		for(int n:al){
			System.out.println(n);
		}
			
	}

}
