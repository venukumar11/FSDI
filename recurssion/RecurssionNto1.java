//WAP to print n to 1
import java.util.Scanner;
class RecurssionNto1
{
	public static void nto1(int n)
	{
		if (n==0)
		{
			return;
		}
		System.out.println(n);
		nto1(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		nto1(n);
	}
}
