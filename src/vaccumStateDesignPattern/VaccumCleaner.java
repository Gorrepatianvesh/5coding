package vaccumStateDesignPattern;

public class VaccumCleaner {

	VaccumCleanerState cleanCarpet;
	VaccumCleanerState cleanDirtState;
	VaccumCleanerState cleanWaterState;
	VaccumCleanerState donotCleanCarpet;
	VaccumCleanerState donotCleanWaterState;
	VaccumCleanerState donotCleanDirtState;
	
	VaccumCleanerState state;
	
	public VaccumCleaner()
	{
		cleanCarpet = new CleanCarpet(this);
		cleanDirtState = new CleanDirtState(this);
		cleanWaterState = new CleanWaterState(this);
		donotCleanCarpet = new DonotCleanCarpet(this);
		donotCleanWaterState = new DonotcleanWaterState(this);
		donotCleanDirtState = new DonotCleanDirtState(this);
		
	    state = cleanWaterState;
	}
	
	public void clean()
	{
		state.clean();
	}
	
	void setState(VaccumCleanerState state) {
		this.state = state;
	}
	public VaccumCleanerState getState() {
        return state;
    }
	public VaccumCleanerState getcleanCarpet() {
        return cleanCarpet;
    }
	public VaccumCleanerState getcleandirtState() {
        return cleanDirtState;
    }
	public VaccumCleanerState getcleanwaterState() {
        return cleanDirtState;
    }
	public VaccumCleanerState getdonotcleanCarpet() {
        return donotCleanCarpet;
    }
	public VaccumCleanerState getdonotcleandirtState() {
        return donotCleanDirtState;
    }
	public VaccumCleanerState getdonotcleanwaterState() {
        return donotCleanDirtState;
    }
	
	
}
