package Array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class New_Array
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
		 int Array2[]=new int[4];
		 
		 for(int i=0;i<4;i++)
		 {	 
		   Array2[i]=Array1[i] ;
		   
		 }  
		 
		/* for(int i=0;i<4;i++)
		 {
		 System.out.println(Array[i]);
		 }*/
		 System.out.println(Arrays.toString(Array2));
	   }
}
