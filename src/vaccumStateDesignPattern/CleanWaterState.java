package vaccumStateDesignPattern;

public class CleanWaterState implements VaccumCleanerState {
	  VaccumCleaner vc;
	  public CleanWaterState(VaccumCleaner vc)
	  {
			this.vc = vc;
	  }

	@Override
	public void clean() {
	System.out.println("Vaccum cleaner has cleaned the water...");	
	}

}
