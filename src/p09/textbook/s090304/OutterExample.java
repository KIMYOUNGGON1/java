package p09.textbook.s090304;

import p09.textbook.s090304.Outter.Nested;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
