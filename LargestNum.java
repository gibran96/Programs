/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LargestNum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("Enter first number");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter second number");
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter third number");
		c=Integer.parseInt(br.readLine());
		if(a>b && a>c)
		{
			System.out.println(a+" is the largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is the largest number");
		}
		else if(c>a && c>b)
		System.out.println(c+" is the largest number");
	}
}
		