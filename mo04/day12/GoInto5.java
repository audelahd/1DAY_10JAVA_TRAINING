package mo04.day12;
import java.util.Scanner;

public class GoInto5 {

	//입력한 정숫값이 5로 나누어 떨어지면 이 값은 5로 나눠집니다! 라고 표시하고, 그렇지 않으면 나눠지지 않습니다. 라고 표시하는 프로그램 작성
	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);

		System.out.println("정숫값 입력 : ");
		int n = stdIn.nextInt();
		
		if(n>0){
			if (n%5 ==0) //입력받은 n을 5로 나누었을 때 나머지가 0이면 5로 나누어 떨어지는 경우다.
				System.out.println("이 값은 5로 나눠집니다!");
			else //그렇지 않은 경우
				System.out.println("이 값은 5로 나눠지지 않습니다!");
		}
		else //n이 0이거나 음수이기 때문에 나눌 수 없는 경우
			System.out.println("음의 정숫값을 입력하셨습니다.");
		
	}

}
