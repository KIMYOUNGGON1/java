package P06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
	
	static int a = 30;
	static int b;
	
	static {
		b = 50;
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block2");
	}
	
	MyClass4() {
		//instance field 초기화
		this.j = 5;
	}
}
