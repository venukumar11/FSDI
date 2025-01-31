class LogicalOperator 
{
	public static void main(String[] args) 
	{
		{
			//Divisible by 3 and even or odd
			int a=24;
			System.out.println(a%3==0 && a%2==0);//true
		}
		{
			//last digit of a number divisible by 5 or divisible by 10
			int a=375;
			int b=a%10;
			System.out.println(b%5==0 || b%10==0);//true
		}
		{
			//even or odd using not operator
			int n=34;
			String res = (!(n%2==0)? "odd":"even");
			System.out.println(n+ " is "+res);//34 is even
		}
	}
}
