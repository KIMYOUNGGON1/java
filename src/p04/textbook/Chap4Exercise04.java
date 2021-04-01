package p04.textbook;

public class Chap4Exercise04 {
	public static void main(String[] args) {
		int sum1 = 0; 
		int sum2 = 0;


		while (sum1 + sum2 != 5) {
			sum1 = (int) (Math.random() * 6) + 1;
			sum2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + sum1 + "," + sum2 + ")");
		}
	}
}
