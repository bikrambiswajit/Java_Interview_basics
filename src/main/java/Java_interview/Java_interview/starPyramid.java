package Java_interview.Java_interview;

public class starPyramid {

	public static void main(String[] args) {
		
		int length =10;
		
		for(int i=1; i<length ; i++){
			for(int j=1; j<i; j++){
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
