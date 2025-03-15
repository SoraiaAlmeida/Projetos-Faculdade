/* OBJETIVO: Contruir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade
de números pares e existente no vetor;
  Considere que a entrada deve ser, apenas de numeros naturais diferentes de zero.
 */

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller conPar = new Controller();
		
		int[] vetor = {1,2,3,4,5,6};
		int tamanho = vetor.length;
		int par = conPar.par (vetor, tamanho);
		
		System.out.println("A quantidade de numeros pares é: "+par);
		
		
		

	}

}
