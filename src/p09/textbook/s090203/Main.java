package p09.textbook.s090203;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
//		인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
//		정적 멤버 클래스 객체 생성
		
	}
}
