package Controller;

public class Controller {
	
	public Controller() {
		super();
	}

	public double somatoria(int N) {
		
		if (N == 1) {
			return 1;
			
			// A condição de parada vai ser quando o número  for igual a 1.
					}
		else {
			double soma = 1 /(double)N;
			N = N -1;
			return somatoria (N)+soma;
		}
		                 
		
	
		
		
		
	}

}
