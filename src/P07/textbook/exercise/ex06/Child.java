package P07.textbook.exercise.ex06;

import P07.textbook.exercise.ex06.Parent;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
