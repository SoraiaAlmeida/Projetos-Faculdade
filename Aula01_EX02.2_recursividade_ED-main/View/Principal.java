/* OBJETIVO: 2. Crie uma fun��o recursiva que exiba o total de elementos negativos de um vetor de inteiros, de N posi��es, 
 * passado como par�metro: O c�digo deve trazer como coment�rios: 
 * a) A condi��o de parada b) Como escrever a fun��o para o termo n em fun��o do termo anterior
 */


package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		int [] vetor = {1,2,-3,-4,5,-6,7,-8,9};
		int tamanho = vetor.length;
		
		Controller vet = new Controller();
		
		int contaVetor = vet.contaVetor(vetor, tamanho);
		
		System.out.println(contaVetor);

	}

}
