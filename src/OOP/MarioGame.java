package OOP;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Fall");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("go back");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move forward");
	}

}
