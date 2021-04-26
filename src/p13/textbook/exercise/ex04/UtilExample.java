package p13.textbook.exercise.ex04;

import p13.textbook.exercise.ex04.Util;

public class UtilExample {
	public static void main(String[] args) {
		pair<String, Integer> pair = new pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		pair<Integer, String> pair2 = new pair<>(99, "java");
		String name = Util.getValue(pair2, 99);
		System.out.println(name);
	}
}
