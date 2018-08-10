
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	char d;
		Scanner sc=new Scanner(System.in);
		d=sc.next().charAt(0);
		if(d >= '0' && d <= '9')
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
 
	}
}
