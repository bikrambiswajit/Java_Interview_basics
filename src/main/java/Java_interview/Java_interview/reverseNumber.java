package Java_interview.Java_interview;

public class reverseNumber {

	public static void main(String[] args) {


		int a = 14642;
		int rev = 0;
		
		while(a!=0){
			int digit = a%10;
			
			rev = digit + rev*10;
			a=a/10;
		}
		
		System.out.println(rev);
	}

}