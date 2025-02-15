class Car 
{
	String model;
	String brand;
	double price;
	char type;
	Car(String model)
	{
		this.model=model;
	}
	Car(String model, String brand)
	{
		this(model);
		this.brand=brand;
	}
	Car(String model,String brand, double price)
	{
		this(model,brand);
		this.price=price;
	}
	Car(String model,String brand, double price,char type)
	{
		this(model,brand,price);
		this.type=type;
	}
	public static void main(String[] args) 
	{
		Car c=new Car("Slavia","Skoda",3454542.34,'P');
		System.out.println(c.model+" "+c.brand+" "+c.price+" "+c.type);
	}
}
