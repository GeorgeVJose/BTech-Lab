import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		factorial(scan.nextInt());
		
	}
	public static void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		System.out.println(n+"! = "+fact);
	}
}