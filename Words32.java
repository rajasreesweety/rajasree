
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{

	public static void main (String[] args) throws java.lang.Exception
	{
		
		
		String s;
         Scanner sc=new Scanner(System.in);
         s=sc.nextLine();
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println(count);
	}
}
