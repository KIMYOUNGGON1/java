package P06.textbook.s060602;

import P06.textbook.s060602.FieldInitValue;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		FieldInitValue fiv2 = new FieldInitValue();
		fiv2.intField = 99;
		
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField);
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
		
	}
}