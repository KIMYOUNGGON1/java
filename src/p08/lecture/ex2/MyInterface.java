package p08.lecture.ex2;

public interface MyInterface {
	// public static final 필드
	public static final int MY_FIELD1 = 1;
	int MY_FIELD2 = 2;
	String My_FIELD3 = "hello";
	// 선언 시 값을 배정해주면 됨. (public static fianl 생략 가능)

	
	// public static 메소드 (클래스 메소드)
	public static void staticMethod1() {
		System.out.println("static method1");
	}
	
	static void staticMethod2() {
		System.out.println("static method2");
	}
	
	// public abstract 메소드 (인스턴스 메소드)
	public abstract void method1(); 
	void method2();
	
	// public default 메소드 (인스턴스 메소드)
	public default void defaultMethod1() {
		System.out.println("default method1");
	}
	
	default void defaultMethod2() {
		System.out.println("default method2");
	}
	//생성자는 가지지 못함.
}
