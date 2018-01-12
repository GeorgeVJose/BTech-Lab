import java.util.Scanner;
public class Pallindrome
{
	public static void main(String args[])
	{
		int i,flag=1;
		String str;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str = scan.next();
	
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println(str+" is pallindrome");
		else
			System.out.println(str+" is not pallindrome");
	}
}
