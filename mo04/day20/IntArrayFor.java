package mo04.day20;

public class IntArrayFor {

	public static void main(String[] args) {
		int[]a = new int [5];
		
		for (int i=0; i<a.length; i++)
			a[i] = 5-i;
		
		for (int i=0; i<a.length; i++)
			System.out.println("a["+i+"] ="+a[i]);

	}

}
