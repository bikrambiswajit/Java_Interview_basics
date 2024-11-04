package Java_interview.Java_interview;

public class countOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = count_occurance("bubble", 'b');
		System.out.println(count);
		
	}

	private static int count_occurance(String word, char letter) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=0;i<word.length();i++){
			
			if(letter==word.charAt(i)){
				
				num++;
			}
		}
		return num;
	}

}
