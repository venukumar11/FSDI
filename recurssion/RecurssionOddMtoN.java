//WAP to print odd numbers m to n
import java.util.Scanner;
class RecurssionOddMtoN
{
	public static void oddMtoN(int m,int n)
	{
		if (m>n)
		{
			return;
		}
		if (m%2!=0)
		{
			System.out.println(m);
		}
		oddMtoN(m+1,n);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter min number");
		int m=s.nextInt();
		System.out.println("Enter max number");
		int n=s.nextInt();
		oddMtoN(m,n);
	}
}
