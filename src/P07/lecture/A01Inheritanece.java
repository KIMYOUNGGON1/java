package P07.lecture;

public class A01Inheritanece {
	// 상속 : 상속받는 클래스는 상속하는 클래스의 멤버를 갖는다.
	
	// 상속받는 클래스: 하위클래스, 자식클래스, sub class
	// 상속하는 클래스: 상위클래스, 부모클래스, super class
	
	// 문법: 서브클래스 extends 수퍼클래스
	
	// 서브클래스는 여러 수퍼클래스를 가질 수 없음.
	// 반대로 하나의 수퍼클래스가 여러 서브클래스에 상속될 수는 있음.
	
	public static void main(String[] args) {
		A01Child o1 = new A01Child();
//		A01Child 02 = new A01Child(3);
		
		o1.i=3;
		o1.method1();
	}
}
