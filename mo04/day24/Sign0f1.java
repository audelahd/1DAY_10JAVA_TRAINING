package mo04.day24;

import java.util.Scanner;

public class Sign0f1 {

	
	static int signOf(int n) {
		int sign =0;
		
		if(n>0)
			sign =1;
		else if (n<0)
			sign =-1;
		
		return sign;
	}
	public static void main(String[] args) {

		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("정수 x :");
		int x = stdIn.nextInt();
		
		int s = signOf(x);
		System.out.println("signOf(x)는"+s+"입니다.");

	}

}
class SignOf2{
	static int signOf(int n) {
		if(n>0)
			return 1;
		else if (n<0)
			return -1;
		
		return 0;
	}
}
