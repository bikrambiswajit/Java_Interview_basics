package Java_interview.Java_interview;

public class reverseStringPallindrome {

	public static void main(String[] args) {
		String s = "Aeroplane";
		String rev="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--){
			rev += s.charAt(i);
		}
		
		System.out.println(rev);

	}

}
