/* OBJETIVO: Criar uma aplicação em Java que tenha uma função recursiva que,
recebendo um número inteiro, converta para binário. Entrada
limitada a 2000

a) Em formato de comentário, como foi definida a  condição de parada;
b) Como foi definida a relação de chamada dos passos;
 
 */

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller bin = new Controller();
		
		int N = 11;
		String conversao = bin.converterBinario(N);
		
		System.out.println(conversao);
		



	}

}
