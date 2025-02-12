//\\
import java.util.Scanner;
class indexMultiply 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int m=s.nextInt();
		System.out.println("Enter 2nd number");
		int n=s.nextInt();
		int sum=0;
		while (m>0 && n>0)
		{
			sum+=(n%10)*(m%10);
			m/=10;
			n/=10;
		}
		System.out.println(sum);
	}
}
