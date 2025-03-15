package View;

import br.edu.fateczl.ordenacao.ordenacaoControllerQuick;

public class Principal_QuickSort {

		public static void main(String[] args) {

	   int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
			
	   ordenacaoControllerQuick ordena = new ordenacaoControllerQuick();
			vetor = ordena.quickSort(vetor, 0, vetor.length - 1);
			
			for (int valor: vetor) {
				System.out.print(valor + " ");
			}
		}
}
