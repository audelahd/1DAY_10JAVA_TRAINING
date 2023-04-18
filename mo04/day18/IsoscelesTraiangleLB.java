package mo04.day18;

import java.util.Scanner;

public class IsoscelesTraiangleLB {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는?");
		int n = stdIn.nextInt();



		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) //for (int j=1; j<=n-i+1; j++) 의 경우 왼쪽 위가 직각인 이등변 삼각형
				System.out.print('*');
			System.out.println();
		}

	}

}
