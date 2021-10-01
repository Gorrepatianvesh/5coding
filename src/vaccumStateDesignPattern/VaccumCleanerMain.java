package vaccumStateDesignPattern;

public class VaccumCleanerMain {

	public static void main(String[] args) {
	
		VaccumCleaner vc = new VaccumCleaner();
		vc.clean();
		
		vc.setState(new DonotcleanWaterState(vc));
		vc.clean();
		
		vc.setState(new CleanDirtState(vc));
		vc.clean();
		
		vc.setState(new DonotCleanDirtState(vc));
		vc.clean();
		
		vc.setState(new CleanCarpet(vc));
		vc.clean();
		
		vc.setState(new DonotCleanCarpet(vc));
		vc.clean();

	}
}
