package p04.textbook;

public class Chap4Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 3; i <100; i += 3) {
			if (i % 3 ==0) {
			sum += i;	
			}
			System.out.println("3의 배수의 합 :" + sum);
		}
	}
}
