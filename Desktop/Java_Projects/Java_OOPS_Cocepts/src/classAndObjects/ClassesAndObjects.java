package classAndObjects;

class Car {
	String brand;
	String colour;
	long price;

	public void drive() {
		System.out
				.println("Driving the " + brand + " car" + " and colour is " + colour + " with the price of " + price);
	}
}

public class ClassesAndObjects {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "Morris_Garrage";
		car.colour = "Black";
		car.price = 2500000l;
		car.drive();

	}

}
