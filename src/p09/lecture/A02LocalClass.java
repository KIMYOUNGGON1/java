package p09.lecture;

public class A02LocalClass {
	// non-static inner class
	class InnerClass {
		
	}
	
	// static nested class 
	static class NestedClass {
		
	}
	
	void method1() {
		//local class
		class Localclass {
			//필드
			//생성자
			//메소드
			
			//(메도스 안에서만 사용이 가능함.)
		}
		Localclass o1 = new Localclass();
	}
}
