package mo04.day13;
import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		//두 정숫값을 읽어서 내림차순으로 정렬

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = stdIn.nextInt();
		System.out.print("정수 b : "); int b = stdIn.nextInt();
		System.out.print("정수 c : "); int c = stdIn.nextInt();
		
		if (a>b) {
			int t = a; //a가 b보다 크면 a와 b를 교환
			a = b;
			b = t;
		}
		if (b>c) {
			int t = b; //b가 c보다 크면 b와 c를 교환
			b = c;
			c = t;
		}
		if (a>b) {
			int t = a; //a가 b보다 크면 a와 b를 교환
			a = b;
			b = t;
		}
		
		System.out.println("a<=b<=c가 되도록 정렬했습니다.");
		System.out.println("변수 a는 "+a+"입니다.");
		System.out.println("변수 b는 "+b+"입니다.");
		System.out.println("변수 c는 "+c+"입니다.");
	}

}
