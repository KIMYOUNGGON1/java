package P06.lecture.paAnnotation;

import java.lang.reflect.Method;

public class A01Anootation {
	//annotation : 메타 데이터 (부가 정보)
		//컴파일러 / 다른 프로그램
		
		// 예 Override
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		@MyAnnotation1
		public void method1() {

		}
}
