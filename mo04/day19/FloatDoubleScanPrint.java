package mo04.day19;

import java.util.Scanner;

public class FloatDoubleScanPrint {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("변수x는 float형입니다. 변수 y는 double형입니다.");
		System.out.println("x : ");
		float x = stdIn.nextFloat();
		System.out.println("y : ");
		double y = stdIn.nextDouble();
		
		System.out.println("x ="+x);
		System.out.println("y= "+y);

	}

}
