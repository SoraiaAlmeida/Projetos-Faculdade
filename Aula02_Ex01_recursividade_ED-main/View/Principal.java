/* OBJETIVO: 1. Criar uma aplicação em Java que tenha uma função recursiva que
calcule o somatório do N primeiros número NATURAIS (a função deve
retornar zero para números negativos)

a) Em formato de comentário, informar como foi definida a condição de parada;
b) Como foi definida a relação de chamada dos passos;
 */

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		Controller cont = new Controller();
		
		int numerosN = 4;
		int soma = cont.soma(numerosN);
		
		
		System.out.println(soma);
		

	}

}
