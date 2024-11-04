package DSA_interview;

public class stringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Bikram");
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(" Panda");
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(str);
		System.out.println(sb.insert(7, "java "));
		System.out.println(sb.replace(1, 6, "sasasa"));
		

	}

}
