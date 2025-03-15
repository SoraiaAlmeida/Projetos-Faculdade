/* OBJETIVO: 2. Crie uma função recursiva que exiba o total de elementos negativos de um vetor de inteiros, de N posições, 
 * passado como parâmetro: O código deve trazer como comentários: 
 * a) A condição de parada b) Como escrever a função para o termo n em função do termo anterior
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
