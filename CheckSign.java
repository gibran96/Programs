/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CheckSign
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int a;
		System.out.println("Enter a number");
		a=Integer.parseInt(br.readLine());
		if(a<0)
		{
			System.out.println("The number is negative");
		}
		else if(a>0)
		{
			System.out.println("The number is positive");
		}
		else if(a==0)
		System.out.println("The number is 0");
	}
}
		