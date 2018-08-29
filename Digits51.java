import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
 
int n;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
            String a=String.valueOf(n);
            String[] s=a.split("");
            for(int i=0;i<s.length;i++)
            {
            	System.out.print(s[i]+" ");
            }	
 
	}
}
