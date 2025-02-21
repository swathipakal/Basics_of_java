package Array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array_reverse
{
	public static void main(String[] args)
	   {
		 int Array1[]=new int[4];
		 System.out.println("Enter the int values");
		 Scanner s1=new Scanner(System.in);
		 for(int i=0;i<4;i++)
		 {	 
		   Array1[i]= s1.nextInt();
		   
		 }  
		 System.out.println(Arrays.toString(Array1));
		 int Array2[]=new int[4];
		 int j=0;
		 for(int i=3;i>=0;i--)
		 {	 
		   Array2[i]=Array1[j] ;
		   j++;
		 }  
		 
		 
	/*	 for(int i=0;i<4;i++)
		 {
		 System.out.println(Array2[i]);
		 }*/
		 System.out.println(Arrays.toString(Array2));
	   
	   }   
}
