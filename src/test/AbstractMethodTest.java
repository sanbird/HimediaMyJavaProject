package test;

abstract class Animal {	
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}


public class AbstractMethodTest {

	public static void main(String[] args) {
		Animal a1 = new Cat();
		a1.cry();
		
		Animal a2 = new Dog();
		a2.cry();

	}

}
