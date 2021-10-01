package vaccumStateDesignPattern;

public class CleanDirtState implements VaccumCleanerState {
	       VaccumCleaner vc;

			public CleanDirtState(VaccumCleaner vc) {
				this.vc = vc;
				}

			@Override
			public void clean() {
			System.out.println("Vaccum Cleaner has cleaned the dirt");	
			}

		

}
