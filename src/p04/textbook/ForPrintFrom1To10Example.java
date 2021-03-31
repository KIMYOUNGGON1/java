package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
//		1~10 홀수만
		
		for(int a=1; a<=10; a++) {
			if (a%2 == 1) {
			System.out.println(a);
			}
		}
		
//		1~10 짝수만
		
		for(int b=1; b<=10; b++) {
			if(b%2 == 0) {
				System.out.println(b);
			}
		}
		
//		10~1
		for(int c=10; c>=1; c--) {
			System.out.println(c);
		}
		
//		10~1 짝수만
		
		for(int d =10; d >=1; d--) {
			if (d%2 ==0) {
				System.out.println(d);
			}
		}
		
//		10~1 홀수만
		
		for(int e =10; e >=1; e--) {
			if (e%2 ==1) {
				System.out.println(e);
			}
		}
	}
}
