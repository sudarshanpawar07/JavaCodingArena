package set;

import java.util.Objects;

public class Car {
	String name;
	String brand;
	double price;
	String color;

	public Car() {

	}

	public Car(String name, String brand, double price, String color) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, color, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

}
