package Java_interview.Java_interview;

public class swapVariables {

	public static void main(String[] args) {

		int a=4;
		int b=5;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}