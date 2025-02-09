//WaP to Second digit in a number
import java.util.Scanner;
class SecondDigit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int start=s.nextInt();
		if (start<0)
		{
			start*=-1;
		}
		while (start>99)
		{	
			start/=10;
		}
		System.out.println("Second digit is:"+(start%10));
	}
}
