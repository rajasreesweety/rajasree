
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i = 0,t1 = 1, t2 = 1,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
 
        while (i<n)
        {
            System.out.print(t1 + "  ");
 
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
 
            i++;
        }
 
	}
}
