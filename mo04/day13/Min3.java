package mo04.day13;
import java.util.Scanner;
public class Min3 {

	public static void main(String[] args) {
		// 3개의 정수 중 최솟값 구하기
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a: "); int a = stdIn.nextInt();
		System.out.print("정수 b: "); int b = stdIn.nextInt();
		System.out.print("정수 c: "); int c = stdIn.nextInt();
		
		
		int min =a;
		if (b<min) min=b;
		if (c<min) min=c; //위 b의 과정을 통과하지 못했으면 이쪽으로 온다.
		//전부 통과하면 여전히 min은 a이다.
		
		
		System.out.println("최솟값은 "+min+"입니다.");
		
	}

}
