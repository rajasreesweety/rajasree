
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
int num1,num2,sum=0;
Scanner sc=new Scanner(System.in);
num1= sc.nextInt();
num2=num1;
while(num2>0)
{
sum = (sum*10) + (num2%10);
num2/=10;
}
if(num1==sum)
System.out.println("yes");
else
System.out.println("no");
}
}
