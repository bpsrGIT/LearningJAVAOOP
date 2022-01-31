package OOP;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal[] animal = {new Dog(), new Cat()};
		for(int i = 0; i<animal.length; i++) {
			animal[i].bark();
		}
		
		cat.bark();
		dog.bark();
	}

}
