
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,f=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=1)
		{
			if(a%2!=0)
			{
				f=1;
			}
			a=a/2;
		}
		if(f==1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
 
	}
}
