package Controller;

public class Controller {
	
	public Controller() {
		super();
	}

	public double somatoria(int N) {
		
		if (N == 1) {
			return 1;
			
			// A condi��o de parada vai ser quando o n�mero  for igual a 1.
					}
		else {
			double soma = 1 /(double)N;
			N = N -1;
			return somatoria (N)+soma;
		}
		                 
		
	
		
		
		
	}

}
