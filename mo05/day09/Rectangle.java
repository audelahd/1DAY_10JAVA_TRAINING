package mo05.day09;

abstract class Shape{
	public abstract String toString();
	public abstract void draw();
	public void print() {
		System.out.println(toString());
		draw();
	}
}

public class Rectangle extends Shape implements Plane2D {

	private int width;
	private int height;
	
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "Rectangle(width:"+width+", height: "+height+")";
	}


	public void draw() {
		for (int i=1; i<=height; i++) {
			for(int j=1; j<=width; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	public int getArea() {return width*height;}
}

class Parallelogram extends Shape implements Plane2D{
	private int width;
	private int height;
	public Parallelogram(int width, int height) {
	
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "Parallelogram [width=" + width + ", height=" + height + "]";
	}
	
	public void draw() {
		for (int i=1; i<=height; i++) {
			for (int j=1; j<=height-i; j++)System.out.print(' ');
			for (int j=1; j<=width; j++) System.out.print('#');
			System.out.println();
		}
	}
	
	public int getArea() {return width*height;}
	
	
}

