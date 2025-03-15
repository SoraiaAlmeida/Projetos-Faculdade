package Controller;

public class Controller {
	
	public Controller() {
		super();
		}
		public int resto(int dividendo, int divisor) {
			
			if (dividendo < divisor) {
			return dividendo;
				
		}
		else {
			return resto (dividendo - divisor, divisor);
		}
		
}
}