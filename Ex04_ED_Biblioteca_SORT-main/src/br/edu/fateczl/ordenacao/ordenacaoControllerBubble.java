package br.edu.fateczl.ordenacao;

public class ordenacaoControllerBubble {


		public ordenacaoControllerBubble() {
			super();
			
			
		}
	   public int[] bubbleSort(int[] vetor) {
		   int tamanho = vetor.length;
		   //rodadas
		   for (int i = 0; i < tamanho ; i++) {
			  // System.out.println("Rodada #"+ i);
			   //Dinâmica
			   for (int j = 0 ; j < tamanho - 1; j++) {
				   if (vetor[j] > vetor [j + 1]) {
					   int aux = vetor[j];
					   vetor[j] = vetor[j + 1];
					   vetor[j + 1] = aux;
					   
				   }
			   }
//			   for (int valor : vetor) {
//				   System.out.print(valor + " ");
//			   }
		   }
		   
			   return vetor;
		   
	   }
	}
