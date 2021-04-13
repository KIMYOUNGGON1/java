package P07.textbook.exercise.ex07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnoeTire snowTire = new SnoeTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();
	}
}
