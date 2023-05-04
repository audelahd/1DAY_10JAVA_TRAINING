package mo05.day04;


abstract class Animal{
	private String name;
	public Animal(String name) {this.name=name;}
	public abstract void bark();
	public String getName() {return name;}
	

}
class Dog extends Animal{
	private String type;
	public Dog(String name, String type) {
		super(name);
		this.type=type;
	}
	public void bark() {System.out.println("멍멍!");}
}

class Cat extends Animal{
	private int age;
	public Cat(String name, int age) {
		super(name); this.age=age;
	}
	public void bark() {System.out.println("냐옹!");}
}

public class AnimalTester1 {
	
	
	public static void main(String[] args) {
		//Animal x = new Animal();
		
		Animal[] a = new Animal[2];
		a[0] = new Dog("뭉치","치와와");
		a[1] = new Cat("마이클",7);
		
		
		for (Animal s : a) {
			System.out.print(s.getName()+" ");
			s.bark();
			System.out.println();
		}

	}

}
