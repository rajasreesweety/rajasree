import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) 
	{
		int n,m,mul;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	mul=n*m;
	if(mul%2==0)
	System.out.println("even");
	else
	System.out.println("odd");

	}
}
