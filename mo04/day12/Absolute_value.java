package mo04.day12;

import java.util.Scanner;

public class Absolute_value {

	public static void main(String[] args) {
		// 정숫값을 읽어서 절댓값을 표시하는 코드를 작성하자

		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("정숫값 입력 : ");
		int n = stdIn.nextInt();
		
		
		if (n>=0) //n이 0과 같거나 크면 절댓값이 n 그대로이기 때문에 그대로 출력해준다.
			System.out.println("절댓값은 "+n+"입니다.");
		
		else { //그 외의 경우에는 n이 음수, 즉 앞에 -가 붙어있으므로 -를 한 번 더 붙여줘서 양수로 만들어 출력해준다. (절댓값은 0보다 큰 값이다)
			System.out.println("절댓값은 "+ -n + "입니다.");
		}
		
	}
}


/*import java.util.Scanner; //abs라는 변수를 따로 빼서 출력할 때 사용한다.
 * 
 * class Absolute{
 * public static void main(String[] args){
 * Scanner stdIn = new Scanner(System.in);
 * 
 * System.out.print("정숫값: ");
 * int n = stdIn.nextInt();
 * int abs;
 * 
 * 
 * if (n>=0)
 * abs = n;
 * else 
 * abs = -n;
 * 
 * System.out.println("절댓값은 "+abs+"입니다");
 * }
 * }
 * 
 */
