package mo04.day28;

import java.util.Scanner;

class Coordinate{
	private double x;
	private double y;
	
	Coordinate(double x, double y){ this.x=x; this.y=y;}
	
	double getX() {return x;}
	double getY() {return y;}
	
	void setX(double x) {this.x=x;}
	void setY(double y) {this.y=y;}
	
	void set (double x, double y) {this.x=x; this.y=y;
}
}

class CoordinateTester1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : "); double x = stdIn.nextDouble();
		System.out.print("Y좌표 : "); double y = stdIn.nextDouble();
		
		Coordinate p = new Coordinate(x,y);
		System.out.println("p = ("+p.getX()+", "+p.getY()+")");
		Coordinate q =p;
		
		q.set(9.9, 9.9);
		System.out.println("p =("+p.getX()+", "+p.getY()+")");
		System.out.println("q =("+q.getX()+", "+q.getY()+")");
		

	}
}
