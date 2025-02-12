//i/p:23145
//o/p:2*3+3*1+1*4+4*5=33
import java.util.Scanner;
class SecondInput 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int sum=0;
		for (;n>0;n/=10)
		{
			sum+=n%10*((n%100)/10);
		}
		System.out.println(sum);
	}
	//public static int countDigit
}
