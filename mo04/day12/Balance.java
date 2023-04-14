package mo04.day12;
import java.util.Scanner;
public class Balance {

	public static void main(String[] args) {
		// a와 b의 대소 관계를 표시하는 프로그램을 작성하자 

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("변수 a : "); int a = stdIn.nextInt();
		System.out.println("변수 b : "); int b = stdIn.nextInt();
		//Scanner 변수를 두 개 받아준다.
		
		if (a>b) //단순 비교 연산을 사용해 조건문을 설정해준다.
			System.out.println("a가 크다.");
		
		else if (a<b)
			System.out.println("b가 크다.");
		
		else // a와 b의 값이 같은 경우만 남았기 때문에 그 경우도 생각해 조건문을 설정해준다.
			System.out.println("a와 b의 값이 같다.");
	}

}
