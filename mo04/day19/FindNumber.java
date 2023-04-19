package mo04.day19;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int MAX_NO = 6;
		int leftNo = MAX_NO;
		int no = rand.nextInt(100);
		
		System.out.println("숫자맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		
		int x;
		do {
			System.out.println("남은 횟수 "+(leftNo--)+"회, 어떤 숫자일까?");
			x =stdIn.nextInt();
			
			if (x>no){
				System.out.println("더 작은 숫자입니다.");
			
			}
			else if(x<no) {
				System.out.println("더 큰 숫자입니다.");
			}
		}while (x!=no && leftNo >0);
		
		if (x==no)
			System.out.print((MAX_NO - leftNo)+"화면에 맞추었습니다.");
		else
			System.out.println("아쉽네요. 정답은 "+no+"입니다.");
	}

}
