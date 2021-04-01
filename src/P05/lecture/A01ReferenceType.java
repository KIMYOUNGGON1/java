package P05.lecture;

import java.util.Scanner;

public class A01ReferenceType {
	public static void main(String[] args) {
//		자료형 (2가지)
//		1. 기본타입(원시타입) primitive type
//		    byte ,short, char, int, long, double, boolean, float
//		2. 참조타입 reference type
//		 	기본타입 외 모두
		
//		차이점
//		기본타입은 데이터를 저장
//		참조타입은 데이터를 저장한 객체의 참조를 저장
		
//		예제 (기본타입)
		int i;
//		4byte의 저장 공간 생성됨.
		i = 3;
//		i에 3이 들어감.

		
//		예제 (참조타입)
		Scanner scanner;
//		scanner라는 저장 공간 생성됨.
		scanner = new Scanner(System.in);
		
	}
}
