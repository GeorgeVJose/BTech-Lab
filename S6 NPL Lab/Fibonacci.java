import java.io.*;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scan.nextInt();
		fib(n);
	}
	
	public static void fib(int n)
	{
		int a=0,b=1,t,i;
		if(n==1)
			System.out.print(a);
		else if(n==2)
			System.out.print(a+" "+b);
		else
		{
			System.out.print(a+" "+b);
			for(i=3;i<=n;i++)
			{
				t=a+b;
				System.out.print(" "+t);
				a=b;
				b=t;
			}
		}
	}

}