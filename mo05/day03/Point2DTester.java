package mo05.day03;

import static java.util.GregorianCalendar.*;
import java.util.GregorianCalendar;

class Point2D{
	static int counter=0;
	static int day;
	
	int x=0;
	int y=0;
	
	static {
		GregorianCalendar today =  new GregorianCalendar();
		day = today.get(DATE);
	}
	{
		if(++counter == day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다 \n", counter);
		}
	}
/*	
	public Point2D() {}
	public Point2D(int x) {this.x=x;}
	public Point2D(int x, int y) {this.x=x; this.y=y;} */
	
	public Point2D() {
		if(++counter == day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다. \n", counter);
		}
	}
	
	public Point2D(int x) {
		if(++counter ==day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다 \n", counter);
		}
		this.x=x;
	}

	public Point2D(int x, int y) {
		if(++counter == day) {
			System.out.print("당첨!!");
			System.out.printf("오늘 %d개의 좌표가 생성됐습니다! \n", counter);
		}
		this.x=x; this.y=y;
	}
	
	//public int getX() {return x;}
	//public int getY() {return y;}
	
	public static int getCounter() {return counter;}
	public String toString() {
		return "("+x+", "+y+")";
	}
	

}
public class Point2DTester {

	public static void main(String[] args) {
		for(int i=0; i<36; i++) {
			Point2D p1 = new Point2D();
			System.out.printf("%2d %s\n", i, p1);
		}

	}

}
