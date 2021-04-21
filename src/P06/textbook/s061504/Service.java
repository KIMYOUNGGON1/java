package P06.textbook.s061504;

import P06.textbook.s061504.PrintAnnotation;

public class Service {

	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}

	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}

	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
