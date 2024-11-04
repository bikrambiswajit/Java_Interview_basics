package Java_interview.Java_interview;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {


		int a[] = {2,5,1,3,7,2};
		int temp = 0;
		
		for(int i=0;i<a.length; i++){
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				System.out.println(Arrays.toString(a));
			}
		}
		
		for(int n: a){
			System.out.println(n);
		}
		

	}

}
