package DSA_interview;

public class pallindromeChecker {
//You are given a string 'S'. Your task is to check whether the string is palindrome or not. 
//For checking palindrome, consider alphabets and numbers only and ignore the symbols and whitespaces.
	
	
	public static void main(String[] args) {

		String S= "m!o>m";
		String rev = "";
		String cleanS = S.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(cleanS);
		
		for(int i=cleanS.length()-1;i>=0;i--){
			rev+=cleanS.charAt(i);
		}
		System.out.println(rev);
		if(rev.equals(cleanS)){
			System.out.println("Pallindrome");
		}else{
			System.out.println("Not pallindrome");
		}
		

	}

}
