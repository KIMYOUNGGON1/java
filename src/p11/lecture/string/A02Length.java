package p11.lecture.string;

public class A02Length {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		int a = str1.length();
		System.out.println(a);
		
		String s1 = str1.substring(18, 19);
		System.out.println(s1);
		
		String s2 = str1.substring(a-1, a);
		System.out.println(s2);
	}
}
