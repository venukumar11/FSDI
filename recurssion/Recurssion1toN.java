//WAP to print 1 to N
import java.util.Scanner;
class Recurssion1toN
{
	public static void print1toN(int n)
	{
		if (n==0)
		{
			return;
		}
		print1toN(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		print1toN(n);
	}
}
