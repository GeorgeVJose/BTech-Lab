import java.util.Scanner;
public class BubbleSort
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[])
	{
		Test bubble_sort = new Test();		

		System.out.println("Enter n : ");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		bubble_sort.sort(a,n);

		
	}
	
}
class Test
{
	public static void sort(int a[], int n)
	{
		System.out.println("Inside Sort");
		int i,j,temp=0;
		for(i=0;i<(n-1);i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(i=0; i<n; i++)
			System.out.print(a[i]+" ");
		
	}
}
