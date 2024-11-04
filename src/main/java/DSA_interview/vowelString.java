package DSA_interview;

public class vowelString {

	public static void main(String[] args) {
		
		String s = "Bikram";
		//String s1="";
		
		for(int i=0; i<s.length(); i++){
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				
				s =s.replaceAll(Character.toString(s.charAt(i)), "");
		}
		
		System.out.println(s);
	}

}
