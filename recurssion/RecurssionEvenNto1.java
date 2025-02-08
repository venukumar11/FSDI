//WAP to print even numbers n to 1
import java.util.Scanner;
class RecurssionEvenNto1
{
	public static void evenNto1(int n)
	{
		if (n==0)
		{
			return;
		}
		if (n%2==0)
		{
			System.out.println(n);
		}
		evenNto1(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		evenNto1(n);
	}
}
