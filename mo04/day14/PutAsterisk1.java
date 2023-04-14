package mo04.day14;

import java.util.Scanner;
public class PutAsterisk1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?");
		
		int n = stdIn.nextInt();
		if (n>0) {
			int i =0;
			while(i<n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}

	}

}


/*
package mon04.day14;

import java.util.Scanner;
public class PutAsterisk2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *를 표시할까요?");
		
		int n = stdIn.nextInt();
		if (n>0) {
			int i =0;
			while(i<n) {
				System.out.print('*');
				i++;
			}
			System.out.println();
		}

	}

} 
*/