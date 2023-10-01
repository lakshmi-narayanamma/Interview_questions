package polyMorphism;

class Animal {
	public void makeSound() {
		System.out.println("Animals make a sound ");
	}
}

class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("The dog barks..");
	}

}

class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("The cat meows..");
	}

}

public class Polymorphism {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.makeSound();
		animal2.makeSound();
	}

}
