package inheritance;
class Vehicle{
	String brand;
	public void start(){
		System.out.println("Starting with a "+brand+" Vehicle");
	}
}
class Car extends Vehicle{
	String color;
	public void drive()
	{
		System.out.println("Driving the "+brand+ " Car"+" and the color is "+color);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.brand = "RangeRover";
		myCar.color = "Black";
		myCar.start();
		myCar.drive();
		
	}

}
