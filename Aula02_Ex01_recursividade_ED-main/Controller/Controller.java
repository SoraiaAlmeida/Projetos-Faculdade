package Controller;

public class Controller {
	
	public Controller() {
		super();
	}
			public int soma(int numerosN) {
				
				if (numerosN <= 0) {
					return 0;
				// A condi��o de parada vai ser quando o n�mero real for menor que zero.
					
				}
				else {
					
				return numerosN + soma (numerosN -1);
				// Caso o numerosNf for maior que zero, deve realizar a somat�ria e fazer ele -1
				}
				
			}
			
}
