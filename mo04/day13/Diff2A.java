package mo04.day13;
import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		// 읽은 두 정숫값의 차를 표시
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 a : ");  int a  = stdIn.nextInt();
		System.out.print("정수 b : ");  int b  = stdIn.nextInt();

		int diff; //차를 표시할 변수 설정
		
		if (a>=b) //a가 b보다 크면 a에서 b를 뺀다.
			diff = a-b;
		else 
			diff = b-a;
		
		System.out.println("두 값의 차이는 "+diff+"입니다.");
	}

}

/*
public class Diff2A { //조건 연산자

	public static void main(String[] args) {
		// 읽은 두 정숫값의 차를 표시
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 a : ");  int a  = stdIn.nextInt();
		System.out.print("정수 b : ");  int b  = stdIn.nextInt();

		int diff = a>=b ? a-b: b-a; //a가 b보다 크거나 같으면 a에서 b를 빼고, 아니면 b에서 a를 뺀다.
		System.out.println("두 값의 차이는 "+diff+"입니다.");
	}

}
*/