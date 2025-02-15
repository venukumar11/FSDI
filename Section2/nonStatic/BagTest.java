class BagTest 
{
	public static void display(Bag b)
	{
		System.out.println(b.brand+" "+b.color+" "+b.price);
	}
	public static void main(String[] args) 
	{
		Bag b1 = new Bag("Wild Craft","black",234.00);
		display(b1);
		Bag b2 = new Bag("Skybags","orange",225.00);
		display(b2);
		Bag b3 = new Bag("American Tourister","blue",250.00);
		display(b3);
	}
}
