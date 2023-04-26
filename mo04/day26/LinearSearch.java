package mo04.day26;

import java.util.Scanner;

public class LinearSearch {
	static int linearSearch(int[] a, int key) {
		for(int i=0; i<a.length; i++)
			if(a[i]==key)
				return i;
		return -1;
	}
	
	static int linearSearchR(int[] a, int key) {
		for(int i=a.length-1; i>=0; i--)
			if(a[i]==key)
				return i;
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수:");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("찾는 값: ");
		int ky=stdIn.nextInt();

		int idxTop = linearSearch(x, ky);
		int idxBtm = linearSearchR(x, ky);
		
		if(idxTop==-1)
			System.out.println("해당 값은 존재하지 않습니다.");
		else if(idxTop==idxBtm)
			System.out.println("해당 값은 x["+idxTop+"]에 있습니다.");
		else {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 x["+idxTop+"]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 x["+idxBtm+"]에 있습니다.");
		}

	}

}
