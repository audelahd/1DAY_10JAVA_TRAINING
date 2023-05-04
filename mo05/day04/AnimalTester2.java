package mo05.day04;


abstract class Animal2{
	private String name;
	public Animal2(String name) {this.name=name;}
	public abstract void bark();
	public String getName() {return name;}
	public abstract String toString();
	public void introduce() {
		System.out.print(toString()+"이다.");
		bark();
	}
	

}
class Dog2 extends Animal2{
	private String type;
	public Dog2(String name, String type) {
		super(name);
		this.type=type;
	}
	public void bark() {System.out.println("멍멍!");}
	public String toString() {
		return type +"의 "+getName();
	}
}

class Cat2 extends Animal2{
	private int age;
	public Cat2(String name, int age) {
		super(name); this.age=age;
	}
	public void bark() {System.out.println("냐옹!");}
	public String toString() {
		return age +"살의 "+getName();
	}
}

public class AnimalTester2 {
	
	
	public static void main(String[] args) {
		//Animal x = new Animal();
		
		Animal2[] a = new Animal2[2];
		a[0] = new Dog2("뭉치","치와와");
		a[1] = new Cat2("마이클",7);
		
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i].introduce();
		}

	}

}
