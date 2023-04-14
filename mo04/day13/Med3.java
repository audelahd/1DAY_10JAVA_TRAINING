package mo04.day13;
import java.util.Scanner;


public class Med3 {

	public static void main(String[] args) {
		//3개의 정수 중 중앙값 구하기
		
		Scanner stdIn = new Scanner(System.in);
		//정수 3개 받기
		System.out.print("정수 a : "); int a = stdIn.nextInt();
		System.out.print("정수 b : "); int b = stdIn.nextInt();
		System.out.print("정수 c : "); int c = stdIn.nextInt();
		
		int med;
		if (a>=b) //a가 b보다 크거나 같을 때
			if(b>=c) //b가 c보다 크거나 같으면
				med=b; //b가 중앙값이고
			else if (a<=c) //a가 c보다 작거나 같으면
				med=a; //a가 중앙이다.
			else //a가 b보다 크거나 같은데 c가 b보다 크고 c가 a보다 작으면 
				med =c; //c가 중앙이다.
		else if (a>c) //a가 c보다 클 때 (베이스 : a가 b보다 작음)
			med=a; //a가 중앙값이고
		else if (b>c) //b가 c보다 클 때
			med = c; //c가 중앙값이다.
		else 
			med = b; //a가 b보다 작은데 c보다도 작고, b가 c보다 작으면 중앙값은 b다.
		
		
		System.out.println("중앙값은"+med+"입니다.");
	}

}
