package p02.lecture;

public class A08TypeFloat {
	public static void main(String[] args) {
//		float: 4byte (32bit) 실수 저장
		
		long longVar = 2200000000L; // int type으로 인식되기 때문에 l을 붙여서 long이라고 알려줘야 함.
//		특별한 이유가 없다면 int 사용
		
		float var;
		var = 3.14F; //실수 literal은 double type (8byte) 그래서 F를 붙여서 float 라고 알려야 함.
//		특별한 이유가 없다면 double 사용
		
//		양수 최대값
		System.out.println(Float.MAX_VALUE);
		
//		양수 최소값
		System.out.println(Float.MIN_VALUE);
		
//		음수 최소값
		System.out.println(- Float.MAX_VALUE);
		
//		음수 최대값
		System.out.println(- Float.MIN_VALUE);
		
//		양의 무한대
		System.out.println(Float.POSITIVE_INFINITY);
		
//		음의 무한대
		System.out.println(Float.NEGATIVE_INFINITY);
		
//		NaN (Not a Number)
		System.out.println(Float.NaN);
	}
}
