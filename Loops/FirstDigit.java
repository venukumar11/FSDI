//WaP to FirstDigit in a number
import java.util.Scanner;
class FirstDigit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int start=s.nextInt();
		while (start>9)
		{	
			start/=10;
		}
		System.out.println("First digit is:"+start);
	}
}
