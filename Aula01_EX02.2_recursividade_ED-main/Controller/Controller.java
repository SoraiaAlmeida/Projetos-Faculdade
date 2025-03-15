package Controller;

public class Controller {

	public Controller() {
		
		super();
	}

	public int contaVetor (int [] vetor, int tamanho) {
		
		int cont = 0;
		// A condiçao de parada vai ser quando o tamanho do vetor for igual a zero.
		
		if (tamanho == 0) {
			return 0;
			
		} 
		else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			tamanho = tamanho - 1;
				if (valor < 0) {
					cont++;
				}
			return cont + contaVetor(vetor, tamanho);
		}
	}
}
