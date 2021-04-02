package P05.textbook.exercise;

import java.util.Arrays;

public class Exercise07 {
	public static void main(String[] args) {
		int max= Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		
		
		int[] array = {1, 5, 3, 8, 2};
		
		System.out.println("최대값");
		max = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("최소값");
        min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("합계");
		int plus = 0;
		for (int i = 0; i < array.length; i++) {
			plus += array[i];
		}
		
		System.out.println("평균");
		double divide = plus / (double) array.length;
				
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("plus : " + plus);
		System.out.println("avg : " + divide);
	}
}