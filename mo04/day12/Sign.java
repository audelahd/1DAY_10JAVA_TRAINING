package mo04.day12;
import java.util.Scanner;
public class Sign {

	public static void main(String[] args) {
		//정숫값을 읽어 붛를 판정하는 프로그램을 작성하자.

		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("정숫값 입력 : ");
		int n = stdIn.nextInt();
		
		//앞에서 음수인지 아닌지 판단하는 과정에 출력 방향이 0만 더해졌다.
		// 0의 경우만 더 생각해서 조건문을 추가해준다.
		if (n>0) 
			System.out.println("값이 양수입니다.");
		
		else if (n<0)
			System.out.println("값이 음수입니다.");
		
		else
			System.out.println("값이 0입니다.");
	}

}
