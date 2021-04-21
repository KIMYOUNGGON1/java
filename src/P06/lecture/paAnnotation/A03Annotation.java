package P06.lecture.paAnnotation;

import P05.textbook.s050701.Week;

public class A03Annotation {
	@MyAnnotation2(value = "java", attr1 = 3, attr2 = {3, 4, 5}, 
			attr3 = "java", attr4 = Week.THURSDAY,
			attr6 = "spring")
	public void method1() {
		
	}
}
