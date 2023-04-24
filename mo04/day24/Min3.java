package mo04.day24;

import java.util.Scanner;

public class Min3 {

	static int min(int a, int b, int c) {
		int min =a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a: "); int a=stdIn.nextInt();
		System.out.print("정수 b: "); int b=stdIn.nextInt();
		System.out.print("정수 c: "); int c=stdIn.nextInt();

		System.out.println("최솟값은"+min(a,b,c)+"입니다.");
	}

}
