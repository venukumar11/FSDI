//WAP to print factors for every digit given number
import java.util.Scanner;
class FactorsEveryDigit
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A No.:");
		int n=s.nextInt();
		for (int i=n;i>0 ;i/=10)
		{
			System.out.print(i%10+"-");
			for (int j=1;j<=i%10 ;j++ )
			{
				if ((i%10)%j==0)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();	
		}
	}
}
