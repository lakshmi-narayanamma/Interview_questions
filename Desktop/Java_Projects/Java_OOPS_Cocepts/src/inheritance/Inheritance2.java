package inheritance;
class Fruit{
	String name;
	
	public void start() {
		System.out.println("Starting with a "+name+"fruit");
	}
}
class Bananna extends Fruit{
	String colour;
	public void eat() {
		System.out.println("Eating the "+name+"fruit"+"and the fruit colour"+colour);
		
	}
}
 public class Inheritance2 {
	 public static void main(String[] args) {
	 Bananna b=new Bananna();
	 b.name="mango";
	 b.colour="yellow";
	 b.start();
	 b.eat();
	 System.out.println("wel come to inheritance concept");

}}
