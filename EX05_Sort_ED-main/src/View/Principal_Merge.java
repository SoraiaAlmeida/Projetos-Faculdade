 package View;
 
 import br.edu.fateczl.ordenacao.ordenacaoControllerMerge;

public class Principal_Merge {

	
		public static void main(String[] args) {
			int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
			ordenacaoControllerMerge MergeSort = new ordenacaoControllerMerge();
	        vetor = MergeSort.mergeSort(vetor , 0 , vetor.length - 1);
			
			System.out.println("");
			System.out.println("===============================");
			for (int valor : vetor) {
				System.out.print(valor + " ");
			}
			System.out.println("");
			System.out.println("===============================");
		}
	}
