package mo04.day25;

import java.util.Scanner;

public class PrintSeason {

	public static String printSeason(int m) {
		String s="";
		
		switch (m) {
		case 3: case 4 : case 5 : s="봄"; break;
		case 6: case 7 : case 8 : s="여름"; break;
		case 9: case 10 : case 11 : s="가을"; break;
		case 1: case 2 : case 12 : s="겨울"; break;
		}
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);

		int month;
		do {
			System.out.print("몇 월입니까? (1~12): ");
			month = stdIn.nextInt();

		} while (month < 1 || month > 12);

		System.out.printf("해당 월의 계절은 %s입니다.", printSeason(month));

	}

}
