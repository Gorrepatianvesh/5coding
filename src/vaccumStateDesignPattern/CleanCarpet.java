package vaccumStateDesignPattern;

public class CleanCarpet implements VaccumCleanerState {

	VaccumCleaner vc;
	
	public CleanCarpet(VaccumCleaner vc) {
		this.vc = vc;
	}


	@Override
	public void clean() {
	System.out.println("Vaccum cleaner has cleaned the carpet");	
	}

}
