package Java_interview.Java_interview;

public class fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int i=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		while(i<8){
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			i++;
		}

	}

}
