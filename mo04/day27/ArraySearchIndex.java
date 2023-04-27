package mo04.day27;

import java.util.Scanner;

public class ArraySearchIndex {

	static int[] arraySrchIdx(int[] a, int x) {
		int count =0;
		for (int i=0; i< a.length; i++) {
			if (a[i] ==x)
				count++;
		}
		
		int[] c = new int [count--];
		for(int i=a.length-1; count>=0; i--)
			if(a[i]==x)
				c[count--]=i;
		return c;
	}
	public static void main(String[] args) {
		

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 :");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] =stdIn.nextInt();
		}
		
		System.out.print("탐색할 값:");
		int n = stdIn.nextInt();
		int[] b = arraySrchIdx(x, n);
		
		if(b.length==0)
			System.out.println("일치하는 요소가 없습니다.");
		
		else {
			System.out.println("일치하는 요소의 인덱스");
			for(int i=0; i<b.length; i++)
				System.out.println(b[i]);
		}
	}

}
