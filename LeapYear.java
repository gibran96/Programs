/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LeapYear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int a;
		System.out.println("Enter a Year");
		a=Integer.parseInt(br.readLine());
		if(a%100==0)
		{
			if(a%400==0)
			System.out.println("It is a leap year");
		}
		else if(a%4==0)
		{
			System.out.println("It is a leap year");
		}
		
	}
}
		