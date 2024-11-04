package Java_interview.Java_interview;

import java.util.ArrayList;

public class compareTwoArrays {

	public static void main(String[] args) {
		int[] a = {2,4,5,7,8};
		int[] b = {2,4,3,9,8};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++){
			
			if(a[i]==b[i]){
				al.add(a[i]);
			}
		}
		
		for(Integer n : al){
			System.out.println(n);
		}
	}

}
