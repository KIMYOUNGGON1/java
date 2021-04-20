package p11.lecture.object;

public class A02Equals {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		String str1 = new String("java");
		String str2 = "java";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
