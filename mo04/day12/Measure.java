package mo04.day12;
import java.util.Scanner;

class Measure {

	public static void main(String[] args) {
		// 읽은 정숫값인지 약수인지 판별 (논리 부정 연산자 ) 

		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("변수 A : "); int a = stdIn.nextInt();
		System.out.print("변수 B : "); int b = stdIn.nextInt();
		
		if (!(a%b==0)) //논리 연산자 !를 사용하면 a%b==0가 아닐 경우가 된다. 따라서 약수가 아닌 경우의 조건문이다. (나눴을 때 나머지가 나오는 경우가 됨)
			System.out.println("B는 A의 약수가 아닙니다.");
		else 
			System.out.println("B는 A의 약수입니다.");
	}

}

/*
class study0412_03 {

	public static void main(String[] args) {
		// 읽은 정숫값인지 약수인지 판별 (등가 연산자 ) 

		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("변수 A : "); int a = stdIn.nextInt();
		System.out.print("변수 B : "); int b = stdIn.nextInt();
		
		if (a%b==0) //위 코드와 이부분만 다르다. 논리 연산자 !를 사용하지 않고 조건문을 작성한다.
			System.out.println("B는 A의 약수입니다..");
		else 
			System.out.println("B는 A의 약수가 아닙니다.");
	}

}

 */
