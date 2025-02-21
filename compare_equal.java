package Array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class compare_equal 

{
	public static void main(String[] args)
	   {
		 int Array1[]=new int[4];
		 System.out.println("Enter the First values");
		 Scanner s1=new Scanner(System.in);
		 for(int i=0;i<4;i++)
		 {	 
		   Array1[i]= s1.nextInt();
		   
		 }  
		 System.out.println(Arrays.toString(Array1));
		 System.out.println("Enter second array values");
		
		 int Array2[]=new int[4];
		 
		 for(int i=0;i<=3;i++)
		 {	 
		   Array2[i]=s1.nextInt() ;
		   
		 }  
		 System.out.println(Arrays.toString(Array2));
		 
		if( Arrays.equals(Array1, Array2))
		{
			
			System.out.println("Two Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		 
		 
		 
		 
		 
		 
	/*	 for(int i=0;i<4;i++)
		 {
		 System.out.println(Array2[i]);
		 }*/
		// System.out.println(Arrays.toString(Array2));
	   
	   }   
	
}
