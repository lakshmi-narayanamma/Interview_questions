package basics;

public class VariablesAndDataTypes {
	public static void main(String[] args) {

		// Declaration and Intialization Of varibles
		int age = 25;
		double salary = 50000.00;
		char gender = 'M';
		boolean isEmployeed = true;
		String name = "HariPrasad";
		// Printing the Variables
		System.out.println("Name : " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Weather employeed or not : " + isEmployeed);
		System.out.println("Salary: " + salary);

		int num = 10;
		if (num > 0) {
			System.out.println("Positive Number");
		} else if (num < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero..");
		}
		System.out.println("=====For loop========");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n======While loop=======");
		int count = 1;
		while (count <= 5) {
			System.out.print(count + " ");
			count++;
		}
	}

}
