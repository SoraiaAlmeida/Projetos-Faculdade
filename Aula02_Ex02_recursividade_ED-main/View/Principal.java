/* OBJETIVO: Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
recebendo um n�mero inteiro, converta para bin�rio. Entrada
limitada a 2000

a) Em formato de coment�rio, como foi definida a  condi��o de parada;
b) Como foi definida a rela��o de chamada dos passos;
 
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
