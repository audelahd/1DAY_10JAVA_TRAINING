package mo04.day13;
import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		//두 정숫값을 읽어서 내림차순으로 정렬

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = stdIn.nextInt();
		System.out.print("정수 b : "); int b = stdIn.nextInt();
		
		if (a<b) {
			int t = a; //임시 변수 선언 및 대입
			a = b;
			b = t;
		}
		
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는 "+a+"입니다.");
		System.out.println("변수 b는 "+b+"입니다.");
	}

}
