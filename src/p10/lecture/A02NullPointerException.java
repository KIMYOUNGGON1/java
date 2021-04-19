package p10.lecture;

public class A02NullPointerException{
	public static void main(String[] args) {
		System.out.println("프로그램 실행중...");
		
		String str = "java";
		showLenght(str);
		
		str = null; //null : 참조하는 객체(instance)가 없다.
		showLenght(str);
		
		System.out.println("프로그램 종료...");
	}
	
	private static void showLenght(String s) {
		System.out.println("길이는" + s.length());
	}
}
