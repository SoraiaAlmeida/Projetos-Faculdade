/* OBJETIVO: 1. Criar uma aplica��o em Java que tenha uma fun��o recursiva que
calcule o somat�rio do N primeiros n�mero NATURAIS (a fun��o deve
retornar zero para n�meros negativos)

a) Em formato de coment�rio, informar como foi definida a condi��o de parada;
b) Como foi definida a rela��o de chamada dos passos;
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
