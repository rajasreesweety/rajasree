import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 int a,b;
            
   Scanner sc=new Scanner(System.in);
   
   a=sc.nextInt();
    
   b=sc.nextInt();
    	

   for (a=a+1; a < b; a++)
   {
			
    if (a % 2 != 0)
    {
				
     System.out.print(a);
     System.out.print("\t");
				
		
    }
	 
   }
	}
}
