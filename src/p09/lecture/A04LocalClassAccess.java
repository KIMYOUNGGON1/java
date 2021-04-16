package p09.lecture;

public class A04LocalClassAccess {
	void method(final int param) {
//		param과 localVar는 묵시적 final(effectively final)
		final int localVar = 3;
		
//		localVar = 4;
		
		class LocalClass {
			void metho1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
