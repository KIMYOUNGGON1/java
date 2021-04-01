package p04.textbook;

public class Chap4Exercise04 {
	public static void main(String[] args) {
		int sum = (int)(Math.random()*6) + 1;
		int sum2 = (int)(Math.random()*6) + 1;
		
		while (sum + sum2 !=5) {
			if (sum + sum2 ==5) {
				break;
			} else { 
				System.out.println("("+sum+","+sum2+")");
			}
		}
	}
}
