package Java_interview.Java_interview;

public class multiplyWithoutOperator {

	public static void main(String[] args) {
		
		
		int result = multiply(4,5);
		System.out.println(result);
	}
	
	public static int multiply(int a, int b){
		int product = 0;
		int k=1;
		while(k<=b){
			product +=a;
			k++;
		}
		
		return product;
	}

}
