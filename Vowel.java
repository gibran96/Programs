/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Vowell
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		char ch;
		System.out.println("Enter a character");
		ch=(char)br.read();
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
		{
			System.out.println("It is a vowel");
		}
		else 
		{
			System.out.println("It is a consonant");
		}
		
	}
}
		