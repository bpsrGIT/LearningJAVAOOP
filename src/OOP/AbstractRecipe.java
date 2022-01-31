package OOP;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
	//prepare
	abstract void getReady();
	
	//recipe
	abstract void doTheDish();
	
	//cleanup
	abstract void cleanUp();
	

}
