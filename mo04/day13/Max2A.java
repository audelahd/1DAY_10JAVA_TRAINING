package mo04.day13;
import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		// 읽은 2개의 실숫값 중에서 큰 쪽을 표시 (if문)
		
		Scanner stdIn = new Scanner(System.in);
		//실수 두 개의 값을 받아준다
		System.out.println("실수 a : ");  double a  = stdIn.nextDouble();
		System.out.println("실수 b : ");  double b  = stdIn.nextDouble();
		
		double max; //max 변수 생성
		
		if(a>b) //a가 b보다 크면 a가 큰 쪽
			max =a;
		else 
			max= b;
		
		System.out.println("큰 쪽의 값은 "+max+"입니다.");
	}

}

/*
public class Max2B {

	public static void main(String[] args) {
		// 읽은 2개의 실숫값 중에서 큰 쪽을 표시 (조건 연산자)
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수 a : ");  double a  = stdIn.nextDouble();
		System.out.println("실수 b : ");  double b  = stdIn.nextDouble();
		
		double max= a>b ? a:b;
		
		System.out.println("큰 쪽의 값은 "+max+"입니다.");
	}

}
*/

