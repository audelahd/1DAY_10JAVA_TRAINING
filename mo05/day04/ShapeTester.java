package mo05.day04;

import java.util.Scanner;

abstract class Shape{
	public abstract String toString();
	public abstract void draw();
	public void print() {
		System.out.println(toString());
		draw();
	}
}

class Point extends Shape{
	public Point() {
		
	}
	public String toString() {
		return "Point";
	}
	public void draw() {
		System.out.println('+');
	}
}

abstract class AbstLine extends Shape{
	private int length;
	public AbstLine(int length) {
		setLength(length);
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString() {
		return "AbstLine(length : "+length + ")";
	}
}

class HorzLine extends AbstLine{
	public HorzLine(int length) {
		super (length);
	}
	
	public String toString() {
		return "HorzLine(length:"+ getLength()+")";
	}
	
	public void draw() {
		for (int i=1; i<=getLength();i++)
			System.out.print('-');
		System.out.println();
	}
}

class VertLine extends AbstLine{
	public VertLine(int length) {
		super (length);
	}
	
	public String toString() {
		return "VertLine(length:"+getLength()+")";
	}
	
	public void draw() {
		for (int i=1; i<=getLength(); i++)
			System.out.println('|');
	}
}

class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle (int width, int height) {
		this.width=width; 
		this.height=height;
	}
	
	public String toString() {
		return "Rectangle(width : " + width+", height : "+height+")";
	}
	
	public void draw() {
		for (int i=1; i<=height; i++) {
			for(int j=1; j<= width; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

public class ShapeTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("도형의 개수 :");
		int no = stdIn.nextInt();
		Shape[] p = new Shape[no];
		
		for (int i=0; i<no; i++) {
			int type;
			do {
				System.out.print((i+1)+"번 도형의 종류(1...점 / 2...수평선"+"/ 3... 수직선 / 4... 사각형) : ");
				type = stdIn. nextInt();
			}while(type <1 || type>4);
			
			switch (type) {
			case 1 : p[i] = new Point();break;
			case 2 : 
			case 3 : System.out.print("길이는 : ");
			int len = stdIn.nextInt();
			p[i] = (type ==2 )? new HorzLine(len) : new VertLine(len); break;
			case 4 : System.out.print("너비 : ");
			int width = stdIn.nextInt();
			System.out.print("높이");
			int height = stdIn.nextInt();
			p[i] = new Rectangle(width, height); break;
			}
		}

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}

}
