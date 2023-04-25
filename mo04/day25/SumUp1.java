package mo04.day25;

import java.util.Scanner;

public class SumUp1 {
	
	static int sumUp(int n) {
		int sum =0;
		for(int i=1; i<=n; i++)
			sum+=i;
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println("1부터 X까지의 합을 구하자.");
		int x;
		do {
			System.out.print("x의 값 : ");
			x=stdIn.nextInt();

		}while(x<=0);
		
		System.out.println("1부터 "+x+"까지의 합은 "+sumUp(x)+"입니다.");

	}

}
