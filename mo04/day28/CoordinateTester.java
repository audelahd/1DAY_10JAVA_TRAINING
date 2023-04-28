package mo04.day28;

import java.util.Scanner;

class Cooordinate{
	private double x= 0.0;
	private double y = 0.0;
	
	public Cooordinate() {}
	public Cooordinate(double x, double y) {set(x,y);}
	public Cooordinate(Cooordinate c) {this(c.x, c.y);}
	
	public double getX() {return x;}
	public double getY() {return y;}
	
	public void setX(double x) {this.x=x;}
	public void setY(double y) {this.y=y;}
	
	public void set(double x, double y) {this.x = x; this.y=y;}
	
	public boolean equalTo(Cooordinate c) {return x ==c.x && y==c.y;}
	public String toString() {return "("+x+","+y+")";}
	
}

public class CoordinateTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표:");
		double x = stdIn.nextDouble();
		System.out.print("Y좌표: ");
		double y = stdIn.nextDouble();
		
		Cooordinate p = new Cooordinate(x,y);
		System.out.println("p = "+p);
		Cooordinate q = new Cooordinate(p);
		
		System.out.println("q와 p를 동일 좌표로 만들었습니다.");
		System.out.println("q = "+q);
		
		if(p.equalTo(q))
			System.out.println("p와 q가 같습니다.");
		else
			System.out.println("p와 q가 다릅니다.");
		
		Cooordinate c1 = new Cooordinate();
		Cooordinate c2 = new Cooordinate(1.1, 2.2);
		
		System.out.println("c1 ="+c1);
		System.out.println("c2 ="+c2);
		
		Cooordinate[] a = new Cooordinate[3];
		for(int i=0; i<a.length; i++)
			a[i] = new Cooordinate();
		
		
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"]"+a[i]);

	}

}














