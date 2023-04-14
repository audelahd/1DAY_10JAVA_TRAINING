package mo04.day13;

import java.util.Scanner;

public class Diff2Digits1 {

	public static void main(String[] args) {
		// 읽은 두 정숫값의 차를 표시
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 a : ");  int a  = stdIn.nextInt();
		System.out.print("정수 b : ");  int b  = stdIn.nextInt();

		int diff = a>=b ? a-b: b-a;
		
		if (diff<=10) //차이가 10보다 같거나 작을경우
			System.out.println("두 값의 차이는 10 이하입니다.");
		else
			System.out.println("두 값의 차이는 11 이상입니다.");

	}

}

/*

public class Diff2Digits2 {

	public static void main(String[] args) {
		// 읽은 두 정숫값의 차를 표시
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 a : ");  int a  = stdIn.nextInt();
		System.out.print("정수 b : ");  int b  = stdIn.nextInt();

		int diff = a>=b ? a-b: b-a;
		
		System.out.println("두 값의 차이는 "+(diff<=10?"10이하":"11이상")+"입니다");
		//출력할 때 조건연산자를 사용해서 한 줄에 끝낸다.

	}

}
*/