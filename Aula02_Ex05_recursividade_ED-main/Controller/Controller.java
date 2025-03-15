package Controller;

public class Controller {

	public Controller() {
		 super();
	}
		 
	public int numero (int num) {
	// A condição de parada vai ser quando o valor inicial for igual a 1 ou 2. E deverá retornar o valor 1.
		
		if ( num == 1 || num == 2 ) {
			return  1 ;
		
	}

		else {
			return numero (num -1) + numero (num -2);
		// Quando o valor inicial de "num" não é igual a 1 ou 2, ele chama a si mesmo duas vezes.
		// os valores retornados pelas chamadas, são somados e retornados como resultado final.	
			
			
		}
}
}
