//WAP to check if the given number is palindrome or not
import java.util.Scanner;
class IsPalindrome  
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
		System.out.println(rev==n ? n+" is palindrome":n+" is not a palindorme");
	}
}
