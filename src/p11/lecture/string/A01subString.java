package p11.lecture.string;

public class A01subString {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		String s1 = str1.substring(0,4);
		System.out.println(s1);

//		마지막 인덱스는 포함 x,
		
		String s2 = str1.substring(5,12);
		System.out.println(s2);
		
		String s3 = str1.substring(13, 19);
		System.out.println(s3);
	}
}
