package p02.lecture;

public class A07TypeChar {
	public static void main(String[] args) {
		//char : 2byte (8bit) 문자 저장
		
//		JS
//		var a = "a";
//			a = "가";
		
//		java 문자열
		String s1 = "hello"; //큰 따옴표 String literal(5장 이후 나오는 내용)
		s1 = "자바";
		s1 = "자";
		s1 = "a";
		s1 = "";
		
		
//		java 문자
		char charVar;
//		charVar = "a"; // not ok 큰 따옴표는 String literal이기 때문
		charVar = 'a'; // char literal
		charVar = '눈';
		System.out.println(charVar);
		charVar = '\uB208';
		System.out.println(charVar);
		charVar = 45576;
//		십진법 값을 넣을 수 있어서 정수타입으로 분류되기도 함
		System.out.println(charVar);
		
//		charVar = '';  //not ok
//		빈 문자열 입력 불가함.
		
		charVar = '\u10E6';
		System.out.println(charVar);
	}
}
