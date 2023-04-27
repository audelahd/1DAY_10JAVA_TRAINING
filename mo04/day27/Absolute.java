package mo04.day27;

import java.util.Scanner;

public class Absolute {
	
	static int absolute(int x) {
		return x >=0?x:-x;
	}
	static long absolute(long x) {
		return x >=0?x:-x;
	}
	static float absolute(float x) {
		return x >=0?x:-x;
	}
	static double absolute(double x) {
		return x >=0?x:-x;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("int형 정수 a의 값: "); int a = stdIn.nextInt();
		System.out.print("long형 정수 a의 값: "); long b = stdIn.nextLong();
		System.out.print("float형 정수 a의 값: "); float c = stdIn.nextFloat();
		System.out.print("double형 정수 a의 값: "); double d = stdIn.nextDouble();
		
		System.out.println("a의 절댓값은"+absolute(a)+"입니다.");
		System.out.println("b의 절댓값은"+absolute(b)+"입니다.");
		System.out.println("c의 절댓값은"+absolute(c)+"입니다.");
		System.out.println("d의 절댓값은"+absolute(d)+"입니다.");

	}

}
