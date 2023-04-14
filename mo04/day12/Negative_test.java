package mo04.day12;


import java.util.Scanner; //스캐너를 사용하기 위해 임포트를 사용해서 불러온다.
class Negative_test {

	public static void main(String[] args) {
		//입력한 정숫값이 음이면 이 값은 음의 값입니다 라고 표시하는 프로그램 작성

		Scanner stdIn = new Scanner(System.in); 
		System.out.print("정숫값 입력 : "); //스캐너로 입력받아서
		int n = stdIn.nextInt(); //정숫값으로 n에 저장한다.
		
		if (n<0) //n이 0보다 작은 값이면 음의 값이다. 그 경우를 조건문으로 잡아준다.
			System.out.println("이 값은 음의 값입니다.");
		
		else { //n이 0과 같거나 0보다 크면 음의 값이 아니기 때문에 위와 같이 조건문을 작성해준다.
			System.out.println("이 값은 음의 값이 아닙니다.");
		}
	}

}
