package p11.textbook.s110702;

public class StringTOLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerstr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
