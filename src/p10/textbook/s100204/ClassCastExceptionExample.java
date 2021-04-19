package p10.textbook.s100204;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		ChangeDog(dog);
		
		Cat cat = new Cat();
		ChangeDog(Cat);
	}
	
	public static void ChangeDog(Animal animal) {
		
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;			
		}
	}
	
	class Animal {}
	class Dog extends Animal {}
	class Cat extends Animal {}
}
