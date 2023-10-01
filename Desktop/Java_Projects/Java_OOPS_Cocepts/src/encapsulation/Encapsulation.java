package encapsulation;

class Person {
	String name;
	int age;
	double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(25);
		person.setName("HariPrasad");
		person.setSalary(30000d);
		System.out.println("Name is: " + person.getName() + "\n age is: " + person.getAge() + "\n salary is: "
				+ person.getSalary());

	}

}
