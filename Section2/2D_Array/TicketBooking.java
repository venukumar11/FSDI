import java.util.*;
class TicketBooking 
{
	public static void remainingTickets(char ch[][])
	{
		int countR=0,countB=0;
		for (int i=0;i<ch.length;i++)
		{
			for (int j=0;j<ch[i].length ;j++ )
			{
				if (ch[i][j]!='X')
				{
					countR++;
				}
				else 
					countB++;
			}
		}
		System.out.println("Remaining Seats: "+countR);
		System.out.println("Booked Seats: "+countB);
	}
	public static void bookTicket(char ch[][],int r,int c)
	{
		if (r>=0 && r<ch.length && c>=0 && c<ch[0].length)
		{
			if (ch[r][c]!='X')
			{
				ch[r][c]='X';
				System.out.println("Ticket booked Successfully");
			}
			else
				System.out.println("Choose another row and col");
		}
		else
			System.out.println("Row and col are invalid");
	}
	public static void displayTicket(char ch[][])
	{
		for (char ch1[]: ch)
		{
			System.out.println(Arrays.toString(ch1));
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total no.of rows and columns");
		char ch[][]= new char[s.nextInt()][s.nextInt()];
		boolean flag = true;
		while (flag)
		{
			System.out.println("1.Book Ticket");
			System.out.println("2.Display available tickets");
			System.out.println("3.To know remainig tickets");
			System.out.println("4.Exit");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter required seat's row and col");
					bookTicket(ch,s.nextInt(),s.nextInt());
				case 3:
					remainingTickets(ch);
				case 2:
					displayTicket(ch);
					break;
				case 4:
					flag=false;
					break;
				default:
					System.out.println("Invalid Seat No.");
			}
		}
	}
}
