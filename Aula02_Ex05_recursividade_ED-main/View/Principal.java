/* Objetivo: Considere a s�rie de Fibonacci:
� 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...

 Escrever uma fun��o recursiva que, dado uma posi��o da s�rie, a fun��o
retorne seu valor. Entrada limitada a 20.

- Como foi definida a condi��o de parada;
- Como foi definida a rela��o de chamada dos passos;
 */

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller fib = new Controller();
		
		int num = 10;
		int numero = fib.numero(num);
		
	
		System.out.println(numero);	 	 
		
		

	}

}
