package java8Features;

interface Demo {
	int addition(int a, int b);
}

interface Subtraction {
	int subtract(int a, int b);
}

interface WithoutParams {
	void print();
}

public class LambdaExpresion {
	public static void main(String[] args) {
		Demo add = (a, b) -> (a + b);
		System.out.println("Addtion is:  " + add.addition(12, 13));

		Subtraction sub = (a, b) -> a - b;
		System.out.println("Subtraction is: " + sub.subtract(20, 8));

		WithoutParams params = () -> {
			System.out.println("Without params interface is called..");
		};
		params.print();
	}

}
