package assignment;
import java.util.Scanner;
public class scanner_methods 
{
	
	static int value;
   
	public static void main(String[] args) 
	{
		System.out.println("Enter the age");
		Scanner var=new Scanner(System.in);
		value=var.nextByte();
			if(value>=18)
			
		{
			System.out.println("You are eligible to vote");
		}
		
		else
		{
			System.out.println("not eligible to vote");
		}
		
	} 

}
