package vaccumStateDesignPattern;

public class DonotCleanDirtState  implements VaccumCleanerState {
	  VaccumCleaner vc;

		public DonotCleanDirtState(VaccumCleaner vc) {
			this.vc = vc;
			}

	@Override
	public void clean() {
	System.out.println("Vaccum cleaner has not cleaned the dirt");	
	}

}
