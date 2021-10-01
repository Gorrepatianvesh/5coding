package vaccumStateDesignPattern;

public class DonotCleanCarpet  implements VaccumCleanerState {

	  VaccumCleaner vc;

		public DonotCleanCarpet(VaccumCleaner vc) {
			this.vc = vc;
			}

	@Override
	public void clean() {
		System.out.println("Vaccum cleaner has not cleaned the carpet");	

	}

}
