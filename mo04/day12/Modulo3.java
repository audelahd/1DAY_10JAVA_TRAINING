package mo04.day12;
import java.util.Scanner;
public class Modulo3 {

	public static void main(String[] args) {
		// 입력한 정숫값을 3으로 나누고 결과에 따라서 3 / 2 / 1의 나머지를 출력하는 프로그램, 양수가 아닌 경우도 표시해준다.
		
		Scanner stdIn = new Scanner(System.in);

		
		System.out.print("정숫값: ");
		int n = stdIn.nextInt();
		
		
		if (n>0)
			if(n%3==0) // n을 3으로 나누었을 때 0이 나오면 3으로 나누어진다.
				System.out.println("이 값은 3으로 나누어집니다.");
			else if (n%3==1) // 1이 나오면 나머지가 1이다.
				System.out.println("이 값을 3으로 나눈 나머지는 1입니다.");
			else // 2가 나오면 나머지가 2다.
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
		else //n이 0보다 작거나 큰 경우의 조건
			System.out.println("이 값은 양수가 아닙니다.");
	}

}
