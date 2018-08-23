
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	String a;
		int count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
	           	if(a.charAt(i)>='0'&&a.charAt(i)<='9')
	         	{
		        	count++;
	        	}
		}
		System.out.println(count);
 
	}
}
