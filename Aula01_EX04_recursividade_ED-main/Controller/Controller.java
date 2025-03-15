package Controller;

public class Controller {
	
	public Controller() {
		super();
		
	}

	public String inversor(String palavra, int tamanho) {
		
		if (tamanho == 0) {
		// A condiçao de parada vai ser quando o tamanho da palavra for igual a zero, o método vai retornar vazio e encerra.
			
			return "";
		} else {
			
			String letra = palavra.substring(0,1);
			tamanho = tamanho - 1;
			return inversor(palavra.substring(1), tamanho) + letra;
			
		}
	
}
}
