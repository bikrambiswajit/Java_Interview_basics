package Java_interview.Java_interview;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  
        
        for(int i=2; i<number/2; i++){
        	
        	if(number%i==0){
        		flag=true;
        		break;
        	}
        }
        if(flag==true){
        	System.out.println("This is a composite number");
        }else
        	System.out.println("This is a prime number");


	}

}
