package Controller;

public class Controller {
	
	public Controller() {
		super();
	}

	public String converterBinario(int n) {
		
		if (n == 0) {
			return "";
			// A condição de parada vai ser quando o n = 0
			
	}
		else {
			int resto = n % 2;
			n = n / 2;
			
			return converterBinario(n) + resto;
			//Caso tenha resto, ele vai armazenar o valor da divisão e concatenar os valores referente a ultima divisão.
		}
			
		}

}
