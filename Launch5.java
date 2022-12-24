package assignment;

import java.util.Scanner;
public class Launch5
{
	public static void main(String[] args)
{
for (int i = 5; i >= 0; i--)
{
	int n = 65;
    for (int j = 0; j <= i; j++)
    {
       System.out.print("*");
    }
    System.out.println();
}
for (int i = 0; i<= 5; i++)
{
   int n = 65;
   for (int j = 0; j <= i; j++)
   {
	   System.out.print("*");	   
   }
 
   for (int j = 0; j <= i; j++)
   {
	   if(i==0||i==n-1)
		   System.out.print("*");	  
	   else
		   System.out.print(" ");	  
		  
   }
   System.out.println();
}
}
}