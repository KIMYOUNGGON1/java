package P05.lecture;

import java.util.Arrays;

public class A31MartixSum {
	public static void main(String[] args) {
		int[][] mat1 = {
				{1, 2, 3},
				{5, 6, 7},
				{9, 8, 7},
				{2, 3, 4},
		};
		
		int[][] mat2 = {
				{22, 33, 44},
				{77, 88, 99},
				{3, 2, 1},
				{0, 1, 2},
		};
		
		int[][] mat3 = sum(mat1, mat2);
	
		System.out.println("mat3:" + Arrays.toString(mat3));
		
		for (int[] row : mat3) {
			System.out.println(Arrays.toString(row));
			
		}
		
		
	}

	private static int[][] sum(int[][] a, int[][] b) {
		int[][] c = new int[4][3];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
}
