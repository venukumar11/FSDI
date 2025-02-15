class Bike 
{
	String model;
	String brand;
	double price;
	Bike(String model)
	{
		this.model=model;
	}
	Bike(String model, String brand)
	{
		this(model);
		this.brand=brand;
	}
	Bike(String model,String brand, double price)
	{
		this(model,brand);
		this.price=price;
	}
	public static void main(String[] args) 
	{
		Bike b=new Bike("Rx100","Yamaha",3454542.34);
		System.out.println(b.model+" "+b.brand+" "+b.price);
	}
}
