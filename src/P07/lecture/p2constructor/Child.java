package P07.lecture.p2constructor;

import P07.lecture.p2constructor.Parent;

public class Child extends Parent {
	private int j;
	
//	public Child() {
//		super(3);
//	}
	
	public Child(int i, int j) {
		super(i);
		this.j = j;
	}
	
}
