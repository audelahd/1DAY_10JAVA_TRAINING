package mo04.day27;

public class AddMatrix {
	
	static boolean addMatrix (int[][]x, int[][] y, int[][] z) {
		if(x.length != y.length || y.length != z.length)
			return false;
		for(int i=0; i<x.length; i++)
			if(x[i].length!=y[i].length||y[i].length!=z[i].length)
				return false;
		for(int i=0; i<x.length; i++)
			for(int j=0; j<x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		return true;
	}

	static void printMatrix(int[][] m) {
		for (int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{6,3,4},{5,1,2}};
		int [][]c = new int[2][3];
		
		if(addMatrix(a, b, c)) {
			System.out.println("행렬 a");printMatrix(a);
			System.out.println("\n행렬 b");printMatrix(b);
			System.out.println("\n행렬 c");printMatrix(c);
		}

	}

}
