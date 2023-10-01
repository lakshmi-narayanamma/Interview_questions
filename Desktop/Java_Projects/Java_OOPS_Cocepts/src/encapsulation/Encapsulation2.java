package encapsulation;

class Employee {
	int id;
	String name;
	String designation;
	int age;
	int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", salary="
				+ salary + "]";
	}

}

public class Encapsulation2 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 12345;
		employee.name = "lakshminarayanamma";
		employee.age = 28;
		employee.designation = "senior software engineer";
		employee.salary = 50000;
		System.out.println(
				"id is:" + employee.getId() + "\n nameis:" + employee.getName() + "\n age is:" + employee.getAge()
						+ "\ndesignation is:" + employee.getDesignation() + "\n salaryis:" + employee.getSalary());
	}
}