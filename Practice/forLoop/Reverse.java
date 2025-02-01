//WAP to reverse a given number
import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A No.:");
		int n=s.nextInt(),rev=0;
		for (int i=n;i>0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		System.out.println(rev);
	}
}
