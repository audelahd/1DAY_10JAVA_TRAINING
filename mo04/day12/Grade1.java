package mo04.day12;
import java.util.Scanner;

class Grade1 {

	public static void main(String[] args) {
		// 점수를 기준으로 성적을 판정하는 프로그램
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("점수 :  ");
		int point = stdIn.nextInt();
		
		if(point>=0 && point <=49) //점수가 0보다 크고 49보다 작음
			System.out.println("가");
		else if (point>=50 && point <=59)
			System.out.println("양");
		else if (point>=60 && point <=69)
			System.out.println("미");
		else if (point>=70 && point <=79)
			System.out.println("우");
		else if (point>=80 && point <=100)
			System.out.println("수");
		else
			System.out.println("잘못된 점수입니다.");
	}
}
