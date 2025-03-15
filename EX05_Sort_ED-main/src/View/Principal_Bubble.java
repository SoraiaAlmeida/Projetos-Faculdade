package View;

import br.edu.fateczl.ordenacao.ordenacaoControllerBubble;

public class Principal_Bubble {


	public class PrincipalBubble {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
			ordenacaoControllerBubble Cont = new ordenacaoControllerBubble();
			vetor = Cont.bubbleSort(vetor);
			
			System.out.println("");
			System.out.println("=======================================");
			for (int valor : vetor) {
				System.out.print(valor+" ");
				
			}
			System.out.println("");
			System.out.println("=======================================");
		}

	}

}
