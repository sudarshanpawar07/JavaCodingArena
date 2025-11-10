package Abstract;

public class Car {
	String name;
	String model;
	String type;
	String color;
	double price;
	
	Car(){
		
	}
	
	Car(String name,String model,String type,String color,double price){
		this.name = name;
		this.model  = model;
		this.type = type;
		this.color = color;
		this.price = price;
		
	}
	
	public String toString()
	{
		return "[" + " Name : " + name + " Model : " + model + " Type : " + type + " Color : " + color + " Price : " + price + "]";
	}

}
