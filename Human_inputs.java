package assignment;

import java.util.Scanner;

public class Human_inputs {

	public static void main(String[] args) {
		
		System.out.println("Input value of a : " );		  
		  
		Scanner s1 = new Scanner(System.in);
				
		byte a=s1.nextByte();
		  
		System.out.println(" value of a is : " + a );
		
		System.out.println("Input boolean value  " );		  
		
		boolean  b= s1.nextBoolean();
		
		System.out.println(" value of b is : " + b );
	}
}
