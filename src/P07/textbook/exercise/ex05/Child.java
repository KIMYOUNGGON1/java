package P07.textbook.exercise.ex05;

import P07.textbook.exercise.ex05.Parent;

public class Child extends Parent {

	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
}
