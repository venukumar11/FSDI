class IncDec 
{
	public static void main(String[] args) 
	{
		{
			int a=10;
			int b=++a;
			int c=a++;
			int d=c++;
			int e=a+1 + b++;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);

		}
		{
			int a=10;
			int b= a++ + ++a;
			int c=b++ + ++a + b++;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		{
			int a =56;
			int b =a++ - --a;
			System.out.println(a);
			System.out.println(b);
		}
		{
			int a=6;
			int b= a++ - ++a + --a + a--;
			int c = b++ + ++a - a++;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
}
/* 12
12
12
11
24
13
24
58
56
0
8
13
12 */