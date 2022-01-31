package OOP;

public class FlyRunner {

	public static void main(String[] args) {
		Flyable flyingObjects1 = new Bird();
		Flyable flyingObjects2 = new Aeroplane();
		Flyable[] flyingobjects = {new Bird(), new Aeroplane()};
		
		for(int i = 0; i <flyingobjects.length; i++) {
			flyingobjects[i].fly();
		}
		
		flyingObjects1.fly();
		flyingObjects2.fly();

	}

}
