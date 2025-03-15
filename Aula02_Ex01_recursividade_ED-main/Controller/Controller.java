package Controller;

public class Controller {
	
	public Controller() {
		super();
	}
			public int soma(int numerosN) {
				
				if (numerosN <= 0) {
					return 0;
				// A condição de parada vai ser quando o número real for menor que zero.
					
				}
				else {
					
				return numerosN + soma (numerosN -1);
				// Caso o numerosNf for maior que zero, deve realizar a somatória e fazer ele -1
				}
				
			}
			
}
