package Controller;

public class Controller {
	
	public Controller () {
		
		super ();
			
		
	}
	public int[] quickSort (int[] vetor, int inicio, int fim) {
		if(fim > inicio) {
			int posicaoPivo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
		return vetor;
	}
	
	public int dividir (int[] vetor, int inicio, int fim) {
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		int pivo = vetor[inicio];
	
		while (ponteiroEsquerda <= ponteiroDireita) {
			while (ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while (ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			if (ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vetor, inicio , ponteiroDireita);
		return ponteiroDireita;
	}

	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[j];
		vetor[j] = vetor[i];
		vetor[i] = aux;
	}

}
