package mo04.day12;
import java.util.Scanner;
public class MultipleOf10 {

	public static void main(String[] args) {
		//읽은 정숫값이 양수이면 10의 배수인지 판정해서 표시

		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 입력 : ");
		int n = stdIn.nextInt();
		
		
		if(n>0)
			if(n%10==0) //n을 10으로 나누었을 때 나머지가 0이면 n은 10의 배수가 된다.
				System.out.println("이 값은 10의 배수입니다.");
			else //그렇지 않은 경우
				System.out.println("이 값은 10의 배수가 아닙니다.");
		
		else //n이 0보다 작거나 같아서 나눠지지 않는 경우
			System.out.println("음의 정숫값을 입력했습니다.");
		
	}

}
