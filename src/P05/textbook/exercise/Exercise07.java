package P05.textbook.exercise;

import java.util.Arrays;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		
		int[] array = {1, 5, 3, 8, 2};
		
		int max1 = max;
		
		System.out.println("max : " + max1);
	}
	
	public static int max1(int[] array ) {
		Arrays.sort(array);
		int s = array[array.length-1];
	}
	return s;
}
