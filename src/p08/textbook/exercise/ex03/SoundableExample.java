package p08.textbook.exercise.ex03;

public class SoundableExample {
	private static void printsound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printsound(new Cat());
		printsound(new Dog());
	}
}
