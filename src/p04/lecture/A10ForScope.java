package p04.lecture;

public class A10ForScope {
	public static void main(String[] args) {
		int a = 10;
		
		System.out.println(a);
		
		int i;
		for (i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println(i); //외부 선언을 통해서 block 밖에서도
		                      //사용가능
//		System.out.println(i); 선언된 block을 벗어났기 떄문에 컴파일 에러 발생
		
	}
}
