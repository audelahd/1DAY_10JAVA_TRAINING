package mo04.day27;

import java.util.Scanner;

public class ArrayRemoveOf {
	
	static int[] arrayRmvOf(int[] a, int idx) {
		if(idx<0 && idx>=a.length-1)
			return a.clone();
		
		else {
			int[] c = new int[a.length-1];
			int i=0; 
			for(; i<idx; i++)
				c[i]=a[i];
			for(; i<a.length-1; i++)
				c[i]=a[i+1];
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
        int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] =stdIn.nextInt();
		}
		
		System.out.print("삭제할 요소의 인덱스:");
		int idx = stdIn.nextInt();
		
		int[] y = arrayRmvOf(x, idx);
		for(int i=0; i<y.length;i++)
			System.out.println("y["+i+"]="+y[i]);

	}

}
