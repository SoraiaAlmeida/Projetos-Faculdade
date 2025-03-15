package View;

import br.fateczl.pilhasInt.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception{
		
		PilhaInt p = new PilhaInt();
		int [] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		int tamanho = vetor.length;
		
		for (int i = 0; i < tamanho; i++) {
			if (vetor[i] >= 0) {
				p.push(vetor[i]);
			} else if (vetor[i] < 0) {
				int num1 = p.pop();
				int num2 = p.pop();
				int res = num1 + num2;
				p.push(vetor[i]);
				p.push(res);
			}
		}
		int tamanhoPilha = p.tamanho();
		System.out.println("O tamanho da pilha é:"+tamanhoPilha);
	}

}