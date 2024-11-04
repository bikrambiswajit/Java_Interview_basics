package Java_interview.Java_interview;

public class differenceBetweenAdjacentArrayvalues {

	public static void main(String[] args) {
		
		int[] a = {2,4,8,15,23,43};
		int diff = 0;
		
		for(int i=0; i<a.length-1;i++){
			
			if(diff<a[i+1]-a[i]){
				diff=a[i+1]-a[i];
			}
		}
		System.out.println(diff);
	}

}
