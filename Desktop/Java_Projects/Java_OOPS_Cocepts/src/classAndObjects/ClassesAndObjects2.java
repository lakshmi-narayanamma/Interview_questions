package classAndObjects;
class Pen {
	int  pen_id;
	String pen_name;
	String  colour;
	String  brand;
	int  pen_cost;
	public void write() {
		System.out
		.println("Writing the pen_id"+pen_id+" pen_name"+pen_name+"and  pen _color is"+colour+"pen brand"+brand+"with theprice of"+ pen_cost);
		
	}

}
public class ClassesAndObjects2{
	public static void main(String[] args) {
		Pen pen=new Pen();
		pen.pen_id=1;
		pen.pen_name="gitlerpen";
       pen.brand="rynolds";	
       pen.colour="blue";
       pen.pen_cost=20;
	}
}