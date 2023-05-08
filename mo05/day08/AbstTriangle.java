package mo05.day08;


abstract class Shape{
	public abstract String toString();
	public abstract void draw();
	public void print() {
		System.out.println(toString());
		draw();
	}
}

public abstract class AbstTriangle extends Shape {

	private int length;
	
	public AbstTriangle(int length) {
		setLength(length);
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String toString() {
		return "AbstTriangle(length:"+length+")";
	}
}

class TriangleLB extends AbstTriangle{
	public TriangleLB(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleLB(length:"+getLength()+")";
	}
	
	public void draw() {
		for(int i=1; i<=getLength();i++) {
			for(int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

class TriangleLU extends AbstTriangle{
	public TriangleLU(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleLU(length:"+getLength()+")";
	}
	
	public void draw() {
		for(int i=1; i<=getLength();i++) {
			for(int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

class TriangleRB extends AbstTriangle{
	public TriangleRB(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleRB(length:"+getLength()+")";
	}
	
	public void draw() {
		for(int i=1; i<=getLength();i++) {
			for(int j=1; j<=getLength()-i; j++)
				System.out.print(' ');
			for (int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

class TriangleRU extends AbstTriangle{
	public TriangleRU(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleRU(length:"+getLength()+")";
	}
	
	public void draw() {
		for(int i=getLength(); i>=1;i--) {
			for(int j=1; j<=getLength()-i; j++)
				System.out.print(' ');
			for (int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
