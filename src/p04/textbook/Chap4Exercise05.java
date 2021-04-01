package p04.textbook;

public class Chap4Exercise05 {
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		
		for (int x = 0; x <=10; x++) {
			for(int y = 0; y <=10; y++) {
				if ((a*x) + (b *y) == 60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
}
