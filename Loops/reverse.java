//WaP to reverse a number
import java.util.Scanner;
class reverse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int start=s.nextInt(),rev=0;
		while (start>0)
		{	
			rev=rev*10+start%10;
			start/=10;
		}
		System.out.println(rev);
	}
}
