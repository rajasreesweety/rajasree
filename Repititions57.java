import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
int n, x, count = 1, i = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int[n];
        for(i = 1; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        x = s.nextInt();
        for(i = 1; i < n; i++)
        {
            if(a[i] == x)
            {
                count=count+1;
            }
        }
        System.out.println(count);

	}
}
