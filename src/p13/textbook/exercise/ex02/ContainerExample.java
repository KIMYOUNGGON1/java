package p13.textbook.exercise.ex02;

public class ContainerExample {
	public static void main(String[] args) {
		Containter<String> container1 = new Containter<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Containter<Integer> contaicer2 = new Containter<Integer>();
		contaicer2.set(6);
		int value = contaicer2.get();
		
	}
}


