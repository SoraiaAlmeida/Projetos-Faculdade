/* Objetivo: Criar uma fun��o recursiva que solucione a fun��o (Entrada limitada a 10)
 
 S = 1+ 1 + 1 + 1 + ... + 1
       2   3!  4!        N!
 */

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller cont = new Controller();
		
		int n = 5;
		double soma = cont.soma(n);
		
		System.out.println(soma);
		

	}

}