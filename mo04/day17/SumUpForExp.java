package mo04.day17;

import java.util.Scanner;

public class SumUpForExp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		
		do {
			System.out.println("n의 값: ");
			n = stdIn.nextInt();
			
		}while (n<=0);
		
		int sum = 0;
		for (int i=1; i<n; i++) {
			System.out.println(i+"+");
			sum+=i;
		}
		
		System.out.println(n+"=");
		sum+=n;
		System.out.println(sum);
	}

}
