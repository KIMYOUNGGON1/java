package P05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		
		int[] array = {1, 5, 3, 8, 2};
		
		int max1 = max;
		
		System.out.println("max : " + max1);
	}
	
	public static int max1(int[] array ) {
		int a = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > a) {
				a = array[i];
			}
		}
		return a; 
	}
}
