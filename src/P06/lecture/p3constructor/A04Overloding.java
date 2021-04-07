package P06.lecture.p3constructor;

public class A04Overloding {
	/* 생성자는 하나 이상 있어야 함.
	 * 파라미터의 타입, 갯수, 순서에 의해서 구분됨.
	 */
	public static void main(String[] args) {
	
		computer com1 = new computer("dell", 4, "intel", 123);
		computer com2 = new computer("hp", 8, "amd", 256);
		
		computer com3 = new computer("lenovo", 8, "intel");
		computer com4 = new computer("ms", 16);
		
		System.out.println(com3.ssd);
		System.out.println(com4.cpu);
		System.out.println(com4.ssd);
	}
}
