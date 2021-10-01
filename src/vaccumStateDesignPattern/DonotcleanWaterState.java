package vaccumStateDesignPattern;

public class DonotcleanWaterState implements VaccumCleanerState {
	  VaccumCleaner vc;

		public DonotcleanWaterState(VaccumCleaner vc) {
			this.vc = vc;
			}

	@Override
	public void clean() {
	System.out.println("Vaccum cleaner has not cleaned the water...");	
	}

}