//WAP to print all digits of number using recurssion
import java.util.Scanner;
class RecurssionDigits
{
	public static void Digits(int n)
	{
		if (n==0)
		{
			return;
		}
		System.out.println(n%10);
		Digits(n/10);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		Digits(n);
	}
} 
